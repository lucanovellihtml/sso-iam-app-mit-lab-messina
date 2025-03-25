package com.dxc.mit.iam.controller;

import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dxc.mit.iam.configuration.SSOConfiguration;
import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

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
