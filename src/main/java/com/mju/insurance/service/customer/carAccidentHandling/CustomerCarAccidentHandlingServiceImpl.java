package com.mju.insurance.service.customer.carAccidentHandling;

import org.springframework.stereotype.Service;

@Service
public class CustomerCarAccidentHandlingServiceImpl implements CustomerCarAccidentHandlingService {
//    private final CarAccidentHandlingRepository carAccidentHandlingRepository = CarAccidentHandlingRepository.getInstance();
//    private static final ContractRepository contractRepository = ContractRepository.getInstance();
//    
//    @Override
//    public boolean applyCarAccidentHandling(CarAccidentHandling carAccidentHandling) {
//        return carAccidentHandlingRepository.create(carAccidentHandling);
//    }
//
//	@Override
//	public boolean revokeMyCarAccidentHandling(String id, String customerId) {
//		CarAccidentHandling carAccidentHandling = carAccidentHandlingRepository.getById(id);
//		if(carAccidentHandling == null) return false;
//		Contract contract = contractRepository.get(carAccidentHandling.getContractId());
//		if(contract.getCustomerId().equals(customerId)) return carAccidentHandlingRepository.delete(id);
//		return false;
//	}
//    
//	@Override
//	public ArrayList<CarAccidentHandling> getByCustomerId(String customerId) {
//		ArrayList<CarAccidentHandling> carAccidentHandlings = new ArrayList<>();
//		for(CarAccidentHandling c : carAccidentHandlingRepository.getAll()) {
//			Contract contract = contractRepository.get(c.getContractId());
//			if(contract.getCustomerId().equals(customerId)) {
//				carAccidentHandlings.add(c);
//			}
//		}
//		return carAccidentHandlings;
//	}
}
