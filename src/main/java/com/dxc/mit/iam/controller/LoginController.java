package com.dxc.mit.iam.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.dxc.mit.iam.util.URLUtil;
import com.fasterxml.jackson.databind.JsonSerializable.Base;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
// @RequestMapping("/custom-login")
public class LoginController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(com.dxc.mit.iam.controller.LoginController.class);

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

            modelAndView.addObject("spInitiatedBaseUrl", this.config.getSpInitiatedBaseUrl());
            modelAndView.addObject("idpListUrl", this.config.getIdpListUrl());
            modelAndView.setViewName("/sso/login");
        }
        return modelAndView;
    }

}
