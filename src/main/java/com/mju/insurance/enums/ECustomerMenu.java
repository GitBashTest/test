package com.mju.insurance.enums;

public enum ECustomerMenu {
	insuranceList("보험상품 조회", "ins"),
	consultApplicationManagement("가입 상담 신청 관리", "cons"),
	contractsManagement("나의 보험상품 관리 및 계약 해지", "cont"),
	carAccidentHandlingManagement("사고처리 신청 관리", "car"),
	benefitPaymentManagement("보험금 청구 관리", "ben");
	
	private String str;
	private String url;
	
	private ECustomerMenu(String str, String url) { this.str = str; this.url = url; }
	public String getStr() { return this.str; }
	public String getUrl() { return this.url; }
}
