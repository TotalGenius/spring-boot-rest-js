package com.example.spring_boot_rest_js.controller;

import com.example.spring_boot_rest_js.entity.User;
import com.example.spring_boot_rest_js.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ViewController {
    private final UserService userService;

    public ViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/admin")
    public String getAdminPage(Principal principal, Model model) {
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("user", user);
        return "admin";
    }

    @GetMapping("/user")
    public String getUserPage(Principal principal, Model model) {
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("user", user);
        return "user";
    }
}
