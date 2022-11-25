package com.mju.insurance.service.auth;

import com.mju.insurance.dto.auth.SignUpDTO;

public interface SignUpService {
	boolean signUp(SignUpDTO signUpDTO);
	boolean isEmailDuplicated(String email);
	boolean isRegistrationNoDuplicated(String registrationNo);
	boolean isPhoneNoDuplicated(String phoneNo);
}
