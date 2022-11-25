package com.mju.insurance.enums;

public enum EEmployeeMenu {
	insuranceList("����", "insuranceList"),
	contractsManagement("���", "contract"),
	UWManagement("UW", "UW"),
	Sales("����", "sales"),
	benefitPaymentManagement("����", "benefit"),
	carAccidentHandlingManagement("���ó��", "carAccident");
	
	private String str;
	private String url;
	
	private EEmployeeMenu(String str, String url) { this.str = str; this.url = url; }
	public String getStr() { return this.str; }
	public String getUrl() { return this.url; }
}