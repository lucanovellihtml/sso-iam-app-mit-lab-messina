package com.dxc.mit.iam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestMapping("/custom-login")
public class LoginController {

    @GetMapping("/messaggio-ivan")
    public String pagina(Model model) {
        model.addAttribute("messaggio", "Hi ivan");
        return "pagina";
    }

}
