package com.mju.insurance.service.customer.cancelApplication;

import org.springframework.stereotype.Service;

@Service
public class CustomerCancelApplicationServiceImpl implements CustomerCancelApplicationService {
//    private static final CancelApplicationRepository cancelApplicationRepository = CancelApplicationRepository.getInstance();
//    private static final ContractRepository contractRepository = ContractRepository.getInstance();
//	
//	@Override
//	public boolean applyCancellation(CancelApplication cancelApplication) {
//		if(contractRepository.get(cancelApplication.getContractId()) == null) return false;
//		return (cancelApplicationRepository.add(cancelApplication));
//	}
//	@Override
//	public ArrayList<CancelApplication> getByCustomerId(String customerId) {
//		return cancelApplicationRepository.getByCustomerId(customerId);
//	}
//	@Override
//	public boolean deleteMyCancellation(String id, String customerId) {
//		CancelApplication cancelApplication = cancelApplicationRepository.get(id);
//		if(cancelApplication == null) return false;
//		Contract contract = contractRepository.get(cancelApplication.getContractId());
//		if(contract == null) return false;
//		else if(contract.getCustomerId().equals(customerId)) return cancelApplicationRepository.delete(id);
//		return false;
//	}
}
