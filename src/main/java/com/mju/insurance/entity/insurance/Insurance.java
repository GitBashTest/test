package com.mju.insurance.entity.insurance;

import java.util.ArrayList;

public class Insurance {
	private InsuranceCategory insuranceCategory;
	private ArrayList<Clause> clauses = new ArrayList<>();
	private String id;
	private String name;
	private InsuranceState insuranceState = InsuranceState.BEFORE_AUDIT;

	public void addClause(Clause clause) { this.clauses.add(clause); }
	public void removeClause(Clause clause) {this.clauses.remove(clause);}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Insurance ) {
			return ((Insurance) obj).id.equals(this.id);
		}
		else return false;
	}
	public boolean equalsAttributes(Object obj) {
		if(obj instanceof Insurance) {
			Insurance other = (Insurance) obj;
			if (other.id.equals(this.id) &&
					other.name.equals(this.name) &&
					other.insuranceState.equals(this.insuranceState) &&
					other.insuranceCategory.equals(this.insuranceCategory)) return true;
		}
		return false;
	}

	// getters setters
	public InsuranceCategory getInsuranceCategory() {
		return insuranceCategory;
	}
	public void setInsuranceCategory(InsuranceCategory insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}
	public ArrayList<Clause> getClauses() {
		return clauses;
	}
	public void setClauses(ArrayList<Clause> clauses) {
		this.clauses = clauses;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public InsuranceState getInsuranceState() {
		return insuranceState;
	}
	public void setInsuranceState(InsuranceState insuranceState) {
		this.insuranceState = insuranceState;
	}
}