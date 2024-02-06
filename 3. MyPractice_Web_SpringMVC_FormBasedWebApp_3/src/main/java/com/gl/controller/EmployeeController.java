package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
    // Display the registration form
	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel) {
	
        // Create a new Employee object
		Employee employee = new Employee();
		
        // Add the Employee object to the model with the attribute name "employeeModel"
		theModel.addAttribute("employeeModel", employee);
		
        // Return the view name "employee-form"
		return "employee-form";
	}
	
    // Process the form data
	//@ModelAttribute - it will refer to the property of the model object and it is used 
	//to prepare the model data. This annotation binds a method variable or the model object 
	//to a named model attribute
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeModel") Employee employee) {
        // Return the view name "registration-confirmation"
		return "registration-confirmation";
	}
}
