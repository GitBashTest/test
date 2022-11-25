package com.mju.insurance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping("/customer")
	public String customer() {
		return "customer/customerHome";
	}
	
	@RequestMapping("/employee")
	public String employee() {
		return "employee/employeeHome";
	}
}