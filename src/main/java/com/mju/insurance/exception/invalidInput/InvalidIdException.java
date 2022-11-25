package com.mju.insurance.exception.invalidInput;

public class InvalidIdException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String message = "입력한 ID에 해당하는 결과가 존재하지 않습니다.";

	public InvalidIdException() {
		super(message);
	}
}
