package com.mju.insurance.service.customer.insurance;

import java.util.ArrayList;

import com.mju.insurance.entity.insurance.Insurance;
import com.mju.insurance.entity.insurance.InsuranceCategory;

public interface CustomerInsuranceRetrieveService {
    ArrayList<Insurance> getInsurancesOnSale();
    ArrayList<Insurance> getOnSaleInsuranceByCategory(InsuranceCategory insuranceCategory);
	long getInsuredAmountSum(Insurance insurance);
	long getPremiumSum(Insurance insurance);
}
