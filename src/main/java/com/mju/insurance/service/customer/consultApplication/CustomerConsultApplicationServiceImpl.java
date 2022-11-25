package com.mju.insurance.service.customer.consultApplication;

import org.springframework.stereotype.Service;

@Service
public class CustomerConsultApplicationServiceImpl implements CustomerConsultApplicationService {
//    private static final ConsultApplicationRepository consultApplicationRepository = ConsultApplicationRepository.getInstance();
//	
//	@Override
//	public boolean applyConsultation(ConsultApplication consultApplication) {
//		return consultApplicationRepository.add(consultApplication);
//	}
//	
//	@Override
//	public ArrayList<ConsultApplication> getByCustomerId(String customerId) {
//		return consultApplicationRepository.getByCustomerId(customerId);
//	}
//	
//	@Override
//	public boolean deleteMyConsultation(String id, String customerId) {
//		ConsultApplication consultApplication = consultApplicationRepository.get(id);
//		if(consultApplication == null) return false;
//		else if(consultApplication.getCustomerId().equals(customerId)) return consultApplicationRepository.delete(id);
//		return false;
//	}
}
