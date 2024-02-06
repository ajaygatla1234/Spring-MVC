package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // Stereotype annotation indicating that this class is a Spring component (similar to @Component)
public class HelloController {

    // Adding the request mapping for the root URL ("/")
    @RequestMapping("/")
    public String giveHelloMessage() {
        return "welcome"; // Returns the view name "welcome" - corresponds to a .jsp file in the view folder
    }
    
    // Adding the request mapping for the "/hello" URL
    @RequestMapping("/hello")
    public String giveHelloMessage1() {
        return "hello"; // Returns the view name "hello" - corresponds to a .jsp file in the view folder
    }
    
    // Adding the request mapping for the "/goodbye" URL
    @RequestMapping("/goodbye")
    public String giveHelloMessage2() {
        return "bye"; // Returns the view name "bye" - corresponds to a .jsp file in the view folder
    }
}
