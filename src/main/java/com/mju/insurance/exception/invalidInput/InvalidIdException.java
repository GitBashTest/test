package com.mju.insurance.exception.invalidInput;

public class InvalidIdException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String message = "�Է��� ID�� �ش��ϴ� ����� �������� �ʽ��ϴ�.";

	public InvalidIdException() {
		super(message);
	}
}
