package com.techstarters.SpringSimpleDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String goToHome(){
        return "This is Demo Sample! ";
    }

}
