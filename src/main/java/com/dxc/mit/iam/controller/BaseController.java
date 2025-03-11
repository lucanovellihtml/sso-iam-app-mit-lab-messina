package com.dxc.mit.iam.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dxc.mit.iam.configuration.SSOConfiguration;

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
}
