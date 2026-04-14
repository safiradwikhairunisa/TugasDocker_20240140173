package com.example.demo.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User {
    public final String USERNAME = "admin";
    public final String PASSWORD = "20240140173";

    @GetMapping("/")
    public String login() {
        return  "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            return "home";
        } else {
            model.addAttribute("error",
                    "Invalid username or password");
            return "login";
        }
    }
    @GetMapping("/home")
    public String homepage() {
        return  "home";
    }
}
