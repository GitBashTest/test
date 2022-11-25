package com.mju.insurance.dto.auth;

public class SignUpDTO {
	private String name;
	private String email;
	private String password;
	private int age;
	private boolean gender;
	private String registrationNo;
	private String phoneNo;
	private String accountNo;
	
	public SignUpDTO(String name, String email, String password, int age, boolean gender,
			String registrationNo, String phoneNo, String accountNo) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.registrationNo = registrationNo;
		this.phoneNo = phoneNo;
		this.accountNo = accountNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
