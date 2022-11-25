package com.mju.insurance.vo;

public class ResponseInsurance {
	String name;
	long insuredAmountSum;
	long premiumSum;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public long getInsuredAmountSum() { return insuredAmountSum; }
	public void setInsuredAmountSum(long insuredAmountSum) { this.insuredAmountSum = insuredAmountSum; }
	public long getPremiumSum() { return premiumSum; }
	public void setPremiumSum(long premiumSum) { this.premiumSum = premiumSum; }
}
