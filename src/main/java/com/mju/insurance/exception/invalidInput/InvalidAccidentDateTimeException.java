package com.mju.insurance.exception.invalidInput;

public class InvalidAccidentDateTimeException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String message = "신청할 수 없는 날짜입니다.";

	public InvalidAccidentDateTimeException() {
		super(message);
	}
}
