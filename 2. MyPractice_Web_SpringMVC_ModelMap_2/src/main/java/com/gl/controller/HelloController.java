package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// How to use model
	// Model, ModelMap, and ModelAndView to define a model in Spring MVC
	/*
	 * Model: used to add attributes to the model
	 * ModelMap: defines a holder for model attributes and is primarily designed for adding attributes
	 * ModelAndView: holder for model and view template
	 */

	@RequestMapping("/")
	public String welcome(ModelMap model) {
		model.addAttribute("message", "hello & welcome to project");  // name & value
		return "hello"; // Returns the view name "hello" - corresponds to a .jsp file in the view folder
	}
	
	@RequestMapping("/home")
	public String message(ModelMap model) {
		model.addAttribute("message", "Ur inside the /home path");  // name & value
		return "hello"; // Returns the view name "hello" - corresponds to a .jsp file in the view folder
	}
}
