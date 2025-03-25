package com.dxc.mit.iam.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.WebUtils;

import com.dxc.mit.iam.model.IdPUserUpdate;
import com.dxc.mit.iam.util.URLUtil;
import com.fasterxml.jackson.databind.JsonSerializable.Base;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
// @RequestMapping("/custom-login")
public class LoginController extends BaseController {

    private final BaseController baseController;

    private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.controller.LoginController.class);

    LoginController(BaseController baseController) {
        this.baseController = baseController;
    }

    /*
     * Controller pagina home con i pulsanti spid/spid aziende/cie.
     * Il path di chiamata e la tipologia di chiamata HTTP è definita
     * nell'annotazione @RequestoMapping.
     * 
     */
    @RequestMapping(value = { "/", "/login" }, method = { RequestMethod.GET })
    public ModelAndView loginSpid(Principal p,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String targetUrl,
            HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();

        log.debug("loginSpid method");

        // Recupero del cookie di sessione
        Cookie cookie = WebUtils.getCookie(request, this.config.getCookieName());
        Cookie cookieJwt = WebUtils.getCookie(request, this.config.getJwtCookieName());

        // Controllo della validità del cookie solo se esiste
        if (cookie != null && cookieJwt == null) {
            log.debug("Found token {}= {}", cookie.getName(), cookie.getValue());

            // TODO verificare che la gestione per l'applicazione IPATENTE serva per il
            // porto di messina
            log.debug("------------ MODIFICA PER IPATENTE - INIZIO ------------");

            // Metodo deprecato "isEmpty", sostituito con ObjectUtilis
            // String gotoParamFromSession =
            // !StringUtils.isEmpty(request.getSession().getAttribute(this.config.getTargetUrlParam()))
            // ? (String)request.getSession().getAttribute(this.config.getTargetUrlParam())
            // : null;

            String gotoParamFromSession = !ObjectUtils
                    .isEmpty(request.getSession().getAttribute(this.config.getTargetUrlParam()))
                            ? (String) request.getSession().getAttribute(this.config.getTargetUrlParam())
                            : null;
            log.debug("gotoParamFromSession: " + gotoParamFromSession);

            if (gotoParamFromSession == null) {
                log.debug("gotoParamFromSession == null");
                log.debug("getForgerockIdpInitiatedUrl: " + this.config.getForgerockIdpInitiatedUrl());
                log.debug("SET IN SESSIONE IL PARAMETRO GOTO STATICO");
                request.getSession().setAttribute(this.config.getTargetUrlParam(), this.config
                        .getForgerockIdpInitiatedUrl());
            }

            log.debug("------------ MODIFICA PER IPATENTE - FINE ------------");
            String goTo = targetUrl;
            if (StringUtils.hasText(goTo)) {
                log.debug("Found goTo {}", goTo);
                if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern())) {
                    log.debug("URL VALID");
                    response.setHeader("Location", goTo);
                    response.setStatus(302);
                    return null;
                }
                log.debug("URL NOT VALID");
            }
        }

        // Condizione se il cookie non esiste
        if (StringUtils.hasText(targetUrl)) {
            log.debug("Found goto: " + targetUrl);
            request.getSession().setAttribute(this.config.getTargetUrlParam(), targetUrl);
        }

        if (p != null) {
            log.debug("User already authenticated");
            String goTo = (String) request.getSession().getAttribute(this.config.getTargetUrlParam());
            if (StringUtils.hasText(goTo) && URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern())) {
                log.debug("Redirect to goTo parameter: " + goTo);
                response.setHeader("Location", goTo);
                response.setStatus(302);
                return null;
            }
            if (StringUtils.hasText(this.config.getTargetUrlDefault())) {
                log.debug("Redirect to targetUrlDefault: " + this.config.getTargetUrlDefault());
                response.setHeader("Location", this.config.getTargetUrlDefault());
                response.setStatus(302);
                return null;
            }
            log.debug("Redirect to /authenticated");
            redirect("/authenticated");
        } else {

            log.debug("idpListUrl" + this.config.getIdpListUrl());
            log.debug("spInitiatedBaseUrl" + this.config.getSpInitiatedBaseUrl());
            log.debug("spInitiatedBaseUrlAzienda" + this.config.getSpInitiatedBaseUrlAzienda());

            // Variabile per spid cittadino
            modelAndView.addObject("spInitiatedBaseUrl", this.config.getSpInitiatedBaseUrl());

            // Variabile per spid aziende
            modelAndView.addObject("spInitiatedBaseUrlAzienda", this.config.getSpInitiatedBaseUrlAzienda());

            // Variabile per la list univoca degli idp
            modelAndView.addObject("idpListUrl", this.config.getIdpListUrl());
            modelAndView.setViewName("/sso/login");
        }
        return modelAndView;
    }

    /**
     * Controller pagina post logout richiamata quando un'utenza, già acceduta,
     * vuole disconnetersi.
     * 
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/postlogout" }, method = { RequestMethod.GET })
    public ModelAndView logout() {
        log.debug("Request logout page");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/sso/logout");
        return modelAndView;
    }

    /**
     * Controller pagina logout richiamata quando non viene accettata la privacy
     * durante la creazione dell'utenza spid.
     * 
     * @param headers Mappa che contiene gli header HTTP della richiesta
     * @param request Oggetto che rappresenta la richiesta HTTP ricevuta
     * @param goTo    Parametro della query string opzionale, specifica la URL di
     *                destinazione dopo il logout; il nome del parametro viene preso
     *                dalla variabile nel file yml.
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/postlogin/logout" }, method = { RequestMethod.GET })
    public ModelAndView redirectToLogout(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String goTo) {
        log.debug("entrato in metodo logout per setting isImpersonate a NO");
        ModelAndView modelAndView = new ModelAndView();

        // Oggetto redirect per reindirizzare l'utente all'endpoint /logout
        RedirectView redirect = new RedirectView("/logout");

        /*
         * Creazione dell'oggetto model IdPUserUpdate per poi richiamare i metodi
         * per settare employeeNumber e impersonate nuovi.
         * Questo oggetto poi verra utilizzato come sostituto all'oggetto stesso
         * presente,ma con i parametri vecchi, nel metodo di aggiornamento
         * updateIdpUser.
         */
        IdPUserUpdate idPUser = new IdPUserUpdate();
        idPUser.setEmployeeNumber(Collections.emptyList());
        idPUser.setIsImpersonate("NO");
        try {
            updateIdpUser(idPUser, request, headers);
            log.debug("employeeNumber resettato correttamente ed isImpersonate settato a NO");
        } catch (Exception e) {
            log.error("ERRORE IN METODO redirectToLogout");
            log.error(e.getMessage());
        }

        /*
         * Indica che la redirezione è relativa al contesto dell'applicazione(true).
         * ES: Se il contesto dell'app è /customlogin, e la redirezione è su /home,
         * l'utente sarà reindirizzato a: http://localhost:8080/customlogin/home
         */
        redirect.setContextRelative(true);

        /*
         * Permette di esporre le variabili di percorso nella URL di redirezione.
         * ES: Se l'URL di redirezione contiene qualcosa come /utente/{id}, allora {id}
         * sarà disponibile come variabile nel modello; allora nel modello potremmo
         * accedere a {id} con il suo valore.
         */
        redirect.setExposePathVariables(true);

        // Permette di mantenere gli attributi dell'oggetto model dopo la redirezione
        redirect.setExposeModelAttributes(true);

        modelAndView.setView((View) redirect);

        /*
         * Se la goTo è null o vuota usa un valore di default preso da
         * this.config.getUndoLogoutRedirectUrl() che è il valore preso dalla variabile
         * del file yml di configurazione ---> "${sso.undoLogoutRedirectUrl}".
         * Altrimenti verrà mantenuto il valore originale della goTo passata come
         * parametro nella richiesta GET.
         * Controlla il formato della goTo attraverso la regola recuperata dalla
         * variabile del file yml di configurazione ---> "${sso.targetUrl.pattern}".
         * Se è valido, il goTo viene aggiunto come attributo al model.
         */
        goTo = Optional.<String>ofNullable(goTo).orElse(this.config.getUndoLogoutRedirectUrl());
        if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern()))
            modelAndView.addObject("goto", goTo);
        return modelAndView;
    }

    /**
     * TODO da verificare che sia utilizzata
     * 
     * @param headers Mappa che contiene gli header HTTP della richiesta
     * @param request Oggetto che rappresenta la richiesta HTTP ricevuta
     * @param goTo    Parametro della query string opzionale, specifica la URL di
     *                destinazione dopo il logout; il nome del parametro viene preso
     *                dalla variabile nel file yml.
     * @return La pagina di logout
     */
    @RequestMapping(value = { "/apacs-logout" }, method = { RequestMethod.GET })
    public ModelAndView apacsLogout(@RequestHeader Map<String, String> headers, HttpServletRequest request,
            @RequestParam(required = false, name = "${sso.targetUrl.param}") String goTo) {
        ModelAndView modelAndView = new ModelAndView();
        RedirectView redirect = new RedirectView("/logout");
        IdPUserUpdate idPUser = new IdPUserUpdate();
        idPUser.setEmployeeNumber(Collections.emptyList());
        idPUser.setIsImpersonate("NO");
        try {
            updateIdpUser(idPUser, request, headers);
            log.debug("employeeNumber resettato correttamente ed isImpersonate settato a NO");
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        redirect.setContextRelative(true);
        redirect.setExposePathVariables(true);
        redirect.setExposeModelAttributes(true);
        modelAndView.setView((View) redirect);
        goTo = Optional.<String>ofNullable(goTo).orElse(this.config.getLogoutRedirectUrl());
        if (URLUtil.isValidTargetUrl(goTo, this.config.getTargetUrlPattern()))
            modelAndView.addObject("goto", goTo);
        return modelAndView;
    }

    /**
     * Controller che richiama la pagina di errore not-found.
     * 
     * @return la pagina di errore not-found
     */
    @RequestMapping(value = { "/not-found" }, method = { RequestMethod.GET })
    public ModelAndView notFound() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/not-found");
        return modelAndView;
    }

}
