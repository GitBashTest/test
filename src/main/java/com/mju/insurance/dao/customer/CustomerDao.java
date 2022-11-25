package com.mju.insurance.dao.customer;

import com.mju.insurance.entity.customer.Customer;

public interface CustomerDao {
	public boolean createCustomer(Customer customer);
//	public List<Customer> getCustomers();
	public Customer getCustomerByColumnName(String column, String value);
//	public List<Customer> getCustomersByColumnName(String column, String value);
}
