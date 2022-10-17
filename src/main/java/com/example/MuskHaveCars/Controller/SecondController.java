package com.example.MuskHaveCars.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/page1")
    public String startPage() {
        return "page1";
    }

    @GetMapping("/page2")
    public String start() {
        return "page2";
    }


    @GetMapping("/page3")
    public String customerPage() {
        return "page3";
    }

    @GetMapping("/page4")
    public String booking() {
        return "page4";
    }

    @GetMapping("/About")
    public String AboutUs() {
        return "AboutUs";
    }

    @GetMapping("/Sustainability")
    public String Sustainability() {
        return "Sustainability";
    }

    @GetMapping("/ContactUs")
    public String ContactUs() {
        return "ContactUs";
    }

}
