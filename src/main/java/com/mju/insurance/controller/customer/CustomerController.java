package com.mju.insurance.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@RequestMapping("/cons")
	public String consult() {
		return "customer/consult";
	}
	
	@RequestMapping("/cont")
	public String contract() {
		return "customer/contract";
	}
	
	@RequestMapping("/car")
	public String carAccident() {
		return "customer/carAccident";
	}
	
	@RequestMapping("/ben")
	public String benefit() {
		return "customer/benefit";
	}
}
