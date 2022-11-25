package com.mju.insurance.service.employee.sales;
//import java.util.ArrayList;

import org.springframework.stereotype.Service;

//import com.mju.insurance.entity.consultApplication.ConsultApplication;
//import com.mju.insurance.entity.contract.Contract;
//import com.mju.insurance.entity.contract.ContractState;
//import com.mju.insurance.entity.customer.Customer;
//import com.mju.insurance.entity.insurance.Clause;
//import com.mju.insurance.entity.insurance.Insurance;
//import com.mju.insurance.entity.uw.UW;
//import com.mju.insurance.entity.uw.UWDocument;
//import com.mju.insurance.entity.uw.UWState;

@Service
public class SalesServiceImpl implements SalesService {
//	 private static final ContractRepository contractRepository = ContractRepository.getInstance();
//	 private static final ConsultApplicationRepository consultApplicationRepository = ConsultApplicationRepository.getInstance();
//	 private static final CustomerRepository customerRepository = CustomerRepository.getInstance();
//	 private static final UWRepository uwRepository = UWRepository.getInstance();
//	 private static final InsuranceRepository insuranceRepository = InsuranceRepository.getInstance();
//	 
//	 @Override
//	 public ArrayList<Contract> getAllContract() {
//		 return contractRepository.getAll();
//	 }
//	 @Override
//	 public Insurance getInsuranceByName(String name) {
//		return insuranceRepository.getByName(name);
//	 }
//	 @Override
//	 public Insurance getInsurance(String id) {
//		 return insuranceRepository.get(id);
//	 }
//	 
//	 @Override
//	 public boolean requestUW(Contract contract, ArrayList<UWDocument> documents) {
//		 contract.setState(ContractState.UNDER_UW);
//		 String contractId = this.addContractAndGetId(contract);
//		 
//		 UW uw = new UW();
//		 uw.setDocuments(documents);
//		 uw.setUwState(UWState.UNDER_AUDIT);
//		 uw.setContractId(contractId);
//		 return uwRepository.add(uw);
//	 }
//	 
//	 @Override
//	 public ArrayList<ConsultApplication> getAllConsultApplication() {
//		 return consultApplicationRepository.getAll();
//	 }
//	 @Override
//	 public boolean updateConsultApplication(ConsultApplication consultApplication) {
//		 return consultApplicationRepository.update(consultApplication);
//	 }
//	 @Override
//	 public boolean updateContract(Contract contract) {
//		 return contractRepository.update(contract);
//	 }
//	 @Override
//	 public Customer getCustomerByEmail(String email) {
//		return customerRepository.getByEmail(email);
//	 }
//	 @Override
//	 public Customer getCustomer(String id) {
//		 return customerRepository.get(id);
//	 }
//	 
//	 @Override
//	 public long getInsuredAmount(Insurance insurance, Customer customer) {
//		 ArrayList<Clause> clauses = insurance.getClauses();
//		 long insuredAmount = 0;
//		 for(Clause clause: clauses) {
//			 insuredAmount += clause.getInsuredAmount();
//		 }
//		 return insuredAmount;
//	 }
//	 @Override
//	 public long getInsurancePremium(Insurance insurance, Customer customer, int totalPaymentMonth) {
//		 ArrayList<Clause> clauses = insurance.getClauses();
//		 long premium = 0;
//		 for(Clause clause: clauses) {
//			 premium += clause.getPremium();
//		 }
//		 double ratio = insurance.calculateRatio(customer);
//		 
//		 return (long) (premium * ratio)/totalPaymentMonth;
//	 }
//	 @Override
//	 public ConsultApplication getConsultApplication(String id) {
//		 return consultApplicationRepository.get(id);
//	 }
//	@Override
//	public boolean addContract(Contract contract) {
//		return contractRepository.add(contract);
//	}
//	public String addContractAndGetId(Contract contract) {
//		return contractRepository.addAndGetId(contract);
//	}
//	@Override
//	public ArrayList<Contract> getAllContractRegister() {
//		ArrayList<Contract> contracts = contractRepository.getAll();
//		ArrayList<Contract> contractRegisters = new ArrayList<Contract>();
//		for(Contract contract: contracts) {
//			if(contract.getState() == ContractState.UNDER_UW) contractRegisters.add(contract);
//		}
//		return contractRegisters;
//	}
//	@Override
//	public Contract getContract(String id) {
//		return contractRepository.get(id);
//	}
//	@Override
//	public UW getUW(Contract contract) {
//		ArrayList<UW> UWs = uwRepository.getAll();
//		for(UW uw: UWs) {
//			if(uw.getContractId().equals(contract.getId())) {
//				return uw;
//			}
//		}
//		return null;
//	}
	 
}
