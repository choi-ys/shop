package io.exercise.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    static String INDEX = "index";
    static String HELLO = "hello";

    @GetMapping(value = "/")
    public String index(){
        return INDEX;
    }

    @GetMapping("/hello")
    public String hello(){
        return HELLO;
    }
}
