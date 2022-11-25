package com.mju.insurance.enums;

public enum EInsuranceListMenu {
	marine("�ػ� ����", "marine"),
	car("�ڵ��� ����", "car"),
	driver("������ ����", "driver"),
	fire("ȭ�� ����", "fire"),
	all("��ü ��ȸ", "all");
	
	private String str;
	private String url;
	
	private EInsuranceListMenu(String str, String url) { this.str = str; this.url = url; }
	public String getStr() { return this.str; }
	public String getUrl() { return this.url; }
}
