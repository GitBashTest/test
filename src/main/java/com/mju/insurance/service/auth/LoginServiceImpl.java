package com.mju.insurance.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mju.insurance.dao.customer.CustomerDao;
import com.mju.insurance.dto.auth.LoginDTO;
import com.mju.insurance.entity.customer.Customer;
import com.mju.insurance.enums.ECustomerColumn;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer login(LoginDTO dto) {
		Customer customer = customerDao.getCustomerByColumnName(ECustomerColumn.email.getStr(), dto.getEmail());
		if(customer == null) return null;
		else if(dto.getPassword().equals(customer.getPassword())) return customer;
		else return null;
	}
}
