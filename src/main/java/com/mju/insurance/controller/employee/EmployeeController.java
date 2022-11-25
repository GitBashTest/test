package com.mju.insurance.controller.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@RequestMapping("/insuranceList")
	public String insuranceList() {
		return "employee/insuranceList";
	}

	@RequestMapping("/contract")
	public String contract() {
		return "employee/contract";
	}
	
	@RequestMapping("/UW")
	public String UW() {
		return "employee/UW";
	}
	
	@RequestMapping("/consult")
	public String consult() {
		return "employee/consult";
	}
	
	@RequestMapping("/benefit")
	public String benefit() {
		return "employee/benefit";
	}

	@RequestMapping("/carAccident")
	public String carAccident() {
		return "employee/carAccident";
	}
}
