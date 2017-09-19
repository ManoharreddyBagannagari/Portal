package com.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portal.model.Users;
import com.portal.services.UsersService;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private UsersService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap map) {
		map.addAttribute("greeting", "Welcome");
		return "Welcome";
	}
	
	@RequestMapping(value ="main" ,method = RequestMethod.GET)
	public String main(ModelMap map) {
		map.addAttribute("greeting", "Welcome");
		return "Welcome";
	}
	
	/*
     * This method will provide the medium to add a new employee.
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        Users users = new Users();
        model.addAttribute("users", users);
        model.addAttribute("edit", false);
        return "registration";
    }
	
	

}
