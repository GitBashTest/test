package com.mju.insurance.service.auth;

import com.mju.insurance.dto.auth.LoginDTO;
import com.mju.insurance.entity.customer.Customer;

public interface LoginService {
	Customer login(LoginDTO loginDTO);
}