package com.springbootcamp.security.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }



}