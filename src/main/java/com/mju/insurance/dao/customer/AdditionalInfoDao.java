package com.mju.insurance.dao.customer;

import com.mju.insurance.entity.customer.AdditionalInfo;

public interface AdditionalInfoDao {
	public AdditionalInfo getAdditionalInfoByCustomerId(String customerId);
}
