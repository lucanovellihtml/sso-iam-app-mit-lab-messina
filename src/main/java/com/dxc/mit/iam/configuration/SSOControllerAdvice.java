package com.dxc.mit.iam.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * La classe SSOControllerAdvice è un componente Spring che intercetta le
 * richieste HTTP gestite dai controller. 
 * Il suo scopo principale è quello di aggiungere attributi globali al modello (il ModelAndView) che saranno
 * disponibili in tutte le viste generate dai controller.
 * In questo caso, aggiunge un oggetto ResourceUrlProvider al modello.
 */
@ControllerAdvice
public class SSOControllerAdvice {
    @Autowired
    ResourceUrlProvider resourceUrlProvider;

    @ModelAttribute("urls")
    public ResourceUrlProvider urls() {
        return this.resourceUrlProvider;
    }
}