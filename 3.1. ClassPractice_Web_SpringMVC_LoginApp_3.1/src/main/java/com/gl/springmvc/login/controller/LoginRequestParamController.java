package com.gl.springmvc.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginRequestParamController {

    // Handle login request with request parameters
    @RequestMapping("/loginrqpm")
    public ModelAndView login(@RequestParam("userName") String username, @RequestParam("password") String password, Model model) {

        String message;

        // Check if username and password are valid
        if (username != null && !username.equals("") && username.equals("admin")
                && password != null && !password.equals("") && password.equals("admin")) {
            message = "Welcome " + username + "!";
            model.addAttribute("message", message);
            
            // Return ModelAndView with the view name "welcome" and the message attribute
            return new ModelAndView("welcome", "message", message);
        } else {
            message = "Invalid credentials! Username or password is incorrect";
            
            // Return ModelAndView with the view name "errorpage" and the message attribute
            return new ModelAndView("errorpage", "message", message);
        }
    }
}
