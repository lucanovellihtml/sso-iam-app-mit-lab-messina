package com.dxc.mit.iam.controller;

import com.dxc.mit.iam.configuration.SSOConfiguration;
import com.dxc.mit.iam.configuration.WebContextConfiguration;
//import com.dxc.mit.iam.configuration.WsSoapConfiguration;
import com.dxc.mit.iam.exception.NotFoundException;
import com.dxc.mit.iam.model.IdPUserResponse;
import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.model.msutenze.AggiornaDataUltimaConnessioneRequest;
//import com.dxc.mit.iam.model.soap.ClasseUtenzaUtentiPortaleType;
//import com.dxc.mit.iam.model.soap.DettaglioUtenteMobile;
//import com.dxc.mit.iam.model.soap.RichiestaDettaglioUtentePortaleType;
//import com.dxc.mit.iam.model.soap.RispostaDettaglioUtentePortaleType;
import com.dxc.mit.iam.security.exceptions.UserNotFoundException;
import com.dxc.mit.iam.service.UserService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.WebUtils;

/**
 * Controller che funge da classe base per altri controller.
 * Fornisce metodi di utilità comuni che possono essere riutilizzati in più
 * controller, come la gestione dei reindirizzamenti e la creazione di modelli
 * di errore.
 */
@Controller
public class BaseController {
    private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.controller.BaseController.class);

    @Autowired
    SSOConfiguration config;

    @Autowired
    UserService userService;

    protected RedirectView redirect(String redirectUrl) {
        return redirect(redirectUrl, true);
    }

    protected ModelAndView getErrorModelAndView(ModelAndView modelAndView, String message, Integer timeout,
            String logoutUrl, String viewName) {
        modelAndView = Optional.<ModelAndView>ofNullable(modelAndView).orElse(new ModelAndView());
        modelAndView.addObject("error_msg", message);
        modelAndView.addObject("logoutTimeout", timeout);
        modelAndView.addObject("logoutUrl", logoutUrl);
        modelAndView.setViewName("/postlogin/errorLogout");
        return modelAndView;
    }

    protected RedirectView redirect(String redirectUrl, boolean relativePath) {
        RedirectView redirect = new RedirectView(redirectUrl);
        redirect.setContextRelative(relativePath);
        redirect.setExposePathVariables(false);
        redirect.setExposeModelAttributes(false);
        return redirect;
    }

    /**
     * Metodo che verifica la maggiore età.
     * 
     * Di default il risultato del metodo è false, quindi l'utenza è maggiorenne.
     * La dataLimite è calcolata dalla sottrazione dell'anno corrente con la
     * minAge(18).
     * Per calcolare la maggiore età viene confrontata la dataNascita con la
     * dataLimite.
     * Se la dataNascita è dopo la dataLimite allora è minorenne, altrimento è
     * maggiorenne(dataNascitaObj.after(dataLimite)).
     * 
     * @param dataNascita Data di nascita dell'utente (in formato stringa)
     * @param dateFormat  Formato della data
     * @param minAge      Età minima richiesta per essere considerato maggiorenne
     * @return true se è minorenne, false è maggiorenne
     */
    protected boolean checkAge(String dataNascita, String dateFormat, int minAge) {
        boolean result = false;
        try {
            if (StringUtils.hasText(dataNascita) && StringUtils.hasText(dateFormat) && minAge >= 0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
                Date dataNascitaObj = simpleDateFormat.parse(dataNascita);
                Calendar calendar = Calendar.getInstance();
                calendar.add(1, -minAge);
                Date dataLimite = calendar.getTime();
                result = dataNascitaObj.after(dataLimite);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return result;
    }

    /**
     * Metodo per recuperare le informazioni dell'utente dall'IDP
     * 
     * Recupera il cookie di sessione(che contiene il toket di autenticazione).
     * Controlla se il cookie di sessione e l'header sono presenti, in caso di esito
     * positivo provede con il recuper dell'utente.
     * Recupera l'ID dell'utente dall'header HTTPS e controlla se non è vuoto o
     * nullo.
     * L'ID serve come parametro di ricerca nel metodo getIdPUser per recuperare le
     * informazioni dell'utente dall'IDP; sottoforma di oggetto IdpUserResponse.
     * Se l'utente non esiste, il metodo lancia una UserNotFoundException.
     * Se l'utente non è trovato, il metodo lancia una NotFoundException.
     * 
     * @param request Contiene le informazioni della richiesta HTTP
     * @param headers Mappa contenente gli header HTTP della richiesta
     * @return L'utenza recuperata dall'IDP
     * @throws UserNotFoundException
     * @throws NotFoundException
     */
    protected IdPUserResponse getIdpUser(HttpServletRequest request, Map<String, String> headers)
            throws UserNotFoundException, NotFoundException {
        String method = "[getIdpUser]::";
        IdPUserResponse idPUserResponse = null;
        Cookie cookie = WebUtils.getCookie(request, this.config.getCookieName());
        if (cookie != null && headers != null) {
            log.debug(method + "Found token {}= {}", cookie.getName(), cookie.getValue());
            String idUtente = headers.get(this.config.getHeaderParamNameUserId());
            if (StringUtils.hasText(idUtente)) {
                log.debug(method + "idUtente: " + idUtente);
                idPUserResponse = this.userService.getIdPUser(idUtente);
                log.debug(method + "GET USER OK");
            } else {
                throw new NotFoundException(method + "Utente in sessione non trovato");
            }
        }
        return (IdPUserResponse) Optional.<IdPUserResponse>ofNullable(idPUserResponse)
                .orElseThrow(UserNotFoundException::new);
    }

    /**
     * Metodo per aggionare le informazioni dell'utente con le informazioni
     * contenute nell'oggetto idPUser.
     * Viene recuperato l'id dell'utente dall'header della richiesta e controllato
     * se è presente.
     * In caso di condizione positiva, viene estratto l'id e passato come parametro,
     * insieme all'oggetto idPUser contenete i dati aggiornati, al metodo
     * updateIdPUser del servizio userService.
     * In caso di esito positivo dell'aggiornamento viene stampo il log positivo
     * altrimenti l'errore.
     * 
     * @param idPUser Oggetto che contiene i dati aggiornati da sostituire ai dati
     *                presenti dell'utente ricercato
     * @param request Richiesta Http
     * @param headers Contiente gli header della richiesta Http
     * @throws NotFoundException
     */
    protected void updateIdpUser(IdPUserUpdate idPUser, HttpServletRequest request, Map<String, String> headers)
            throws NotFoundException {
        String idUtente = headers.get(this.config.getHeaderParamNameUserId());
        if (StringUtils.hasText(idUtente)) {
            log.debug("idUtente: " + idUtente);
            // Metodo per l'aggiornamento dei dati
            this.userService.updateIdPUser(idUtente, idPUser);
            log.debug("UPDATE USER OK");
        } else {
            throw new NotFoundException("Utente in sessione non trovato");
        }
    }
}
