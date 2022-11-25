package com.mju.insurance.enums;

public enum EInsuranceListMenu {
	marine("해상 보험", "marine"),
	car("자동차 보험", "car"),
	driver("운전자 보험", "driver"),
	fire("화재 보험", "fire"),
	all("전체 조회", "all");
	
	private String str;
	private String url;
	
	private EInsuranceListMenu(String str, String url) { this.str = str; this.url = url; }
	public String getStr() { return this.str; }
	public String getUrl() { return this.url; }
}
