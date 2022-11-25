package com.mju.insurance.service.customer.insurance;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mju.insurance.dao.insurance.InsuranceDao;
import com.mju.insurance.entity.insurance.Clause;
import com.mju.insurance.entity.insurance.Insurance;
import com.mju.insurance.entity.insurance.InsuranceCategory;
import com.mju.insurance.entity.insurance.InsuranceState;

@Service
public class CustomerInsuranceRetrieveServiceImpl implements CustomerInsuranceRetrieveService {
	
	@Autowired
	private InsuranceDao insuranceDao;

	@Override
	public ArrayList<Insurance> getInsurancesOnSale() {
		ArrayList<Insurance> insurances = (ArrayList<Insurance>) insuranceDao.getInsurances();
		ArrayList<Insurance> filtered = (ArrayList<Insurance>) insurances.stream()
				.filter(insurance -> insurance.getInsuranceState().equals(InsuranceState.ON_SALE))
				.collect(Collectors.toList());
		return filtered;
	}
	
	@Override
	public ArrayList<Insurance> getOnSaleInsuranceByCategory(InsuranceCategory insuranceCategory) {
		ArrayList<Insurance> insurances = getInsurancesOnSale();
		ArrayList<Insurance> filtered = (ArrayList<Insurance>) insurances.stream()
				.filter(insurance -> insurance.getInsuranceCategory().equals(insuranceCategory))
				.collect(Collectors.toList());
		return filtered;
	}
	
	@Override
	public long getInsuredAmountSum(Insurance insurance) {
		ArrayList<Clause> clauses = insurance.getClauses();
		long sum = 0;
        for(Clause clause : clauses) {
            sum += clause.getInsuredAmount();
        }
        return sum;
	}
	
	@Override
	public long getPremiumSum(Insurance insurance) {
		ArrayList<Clause> clauses = insurance.getClauses();
		long sum = 0;
        for(Clause clause : clauses) {
            sum += clause.getPremium();
        }
        return sum;
	}
}
