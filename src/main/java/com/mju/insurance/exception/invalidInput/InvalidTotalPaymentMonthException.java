package com.mju.insurance.exception.invalidInput;

public class InvalidTotalPaymentMonthException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String message = "��ȿ���� ���� �ѳ��Կ��� �Դϴ�.";

	public InvalidTotalPaymentMonthException() {
		super(message);
	}
}
