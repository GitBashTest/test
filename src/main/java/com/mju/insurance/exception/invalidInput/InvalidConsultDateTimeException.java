package com.mju.insurance.exception.invalidInput;

public class InvalidConsultDateTimeException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String message = "��û�� �� ���� ��¥�Դϴ�.";

	public InvalidConsultDateTimeException() {
		super(message);
	}
}
