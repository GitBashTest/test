package com.mju.insurance.enums;

public enum ECustomerMenu {
	insuranceList("�����ǰ ��ȸ", "ins"),
	consultApplicationManagement("���� ��� ��û ����", "cons"),
	contractsManagement("���� �����ǰ ���� �� ��� ����", "cont"),
	carAccidentHandlingManagement("���ó�� ��û ����", "car"),
	benefitPaymentManagement("����� û�� ����", "ben");
	
	private String str;
	private String url;
	
	private ECustomerMenu(String str, String url) { this.str = str; this.url = url; }
	public String getStr() { return this.str; }
	public String getUrl() { return this.url; }
}
