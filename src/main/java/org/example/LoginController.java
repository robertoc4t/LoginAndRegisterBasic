package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String home() {
        return "login"; // ou outro nome de template existente em src/main/resources/templates/
    }
}