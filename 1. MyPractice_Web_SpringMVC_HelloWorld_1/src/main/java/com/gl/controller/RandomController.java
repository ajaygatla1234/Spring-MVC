package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   // Stereotype annotation indicating that this class is a Spring component (similar to @Component)
public class RandomController {

    // Adding the request mapping for the "/randomURL" URL
    @RequestMapping("/randomURL")
    public String returnRandomMessage() {
        return "randomView"; // Returns the view name "randomView" - corresponds to a .jsp file in the view folder
    }
}
