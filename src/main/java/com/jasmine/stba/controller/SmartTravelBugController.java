package com.jasmine.stba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SmartTravelBugController {
    @GetMapping("/")
    public String displayHomePage(){
        return "main/index";
    }
}
