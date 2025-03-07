package com.dxc.mit.iam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custom-login")
public class LoginController {

    @GetMapping("/messaggio-ivan")
    public String pagina(Model model) {
        model.addAttribute("messaggio", "Ivan è gay");
        return "pagina";
    }
	
}
