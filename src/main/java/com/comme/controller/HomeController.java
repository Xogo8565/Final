package com.comme.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home() throws Exception {
        return "home";
    }
}
