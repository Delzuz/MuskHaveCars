package com.example.MuskHaveCars.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {


    @GetMapping("/start")
    public String start() {
        return "cars";
    }



}
