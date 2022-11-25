package com.mju.insurance.controller.customer.insurance;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mju.insurance.entity.insurance.Insurance;
import com.mju.insurance.entity.insurance.InsuranceCategory;
import com.mju.insurance.enums.EInsuranceListMenu;
import com.mju.insurance.service.customer.insurance.CustomerInsuranceRetrieveService;
import com.mju.insurance.vo.ResponseInsurance;

@Controller
@RequestMapping(value = "/customer/ins")
public class CustomerInsuranceController {
	@Autowired
	CustomerInsuranceRetrieveService insuranceRetrieveService;	
	
	@RequestMapping("")
	public String insuranceCategory() {
		return "customer/insuranceCategory";
	}
	
	@RequestMapping("/list")
	public String insuranceList(@RequestParam(value = "category") String categoryStr, Model model) {
		model.addAttribute("category", categoryStr);
		InsuranceCategory category = null;
		if(categoryStr.equals(EInsuranceListMenu.marine.getUrl())) category = InsuranceCategory.MARINE;
		if(categoryStr.equals(EInsuranceListMenu.car.getUrl())) category = InsuranceCategory.CAR;
		if(categoryStr.equals(EInsuranceListMenu.driver.getUrl())) category = InsuranceCategory.DRIVER;
		if(categoryStr.equals(EInsuranceListMenu.fire.getUrl())) category = InsuranceCategory.FIRE;
		ArrayList<Insurance> insurances = insuranceRetrieveService.getOnSaleInsuranceByCategory(category);
		
		ArrayList<ResponseInsurance> responseInsurances = new ArrayList<>();
		for(Insurance insurance : insurances) {
			ResponseInsurance vo = new ResponseInsurance();
			vo.setName(insurance.getName());
			vo.setInsuredAmountSum(insuranceRetrieveService.getInsuredAmountSum(insurance));
			vo.setPremiumSum(insuranceRetrieveService.getPremiumSum(insurance));
			responseInsurances.add(vo);
		}
		
		model.addAttribute("insurances", responseInsurances);
		return "customer/insuranceList";
	}
}
