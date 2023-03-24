package com.techstarters.SpringSimpleDemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String goToHome(){
        log.info("This is the method called on everytime Home page is called");
        return "This is Demo Sample! ";
    }

}
