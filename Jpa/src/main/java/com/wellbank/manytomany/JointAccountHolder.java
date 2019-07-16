package com.wellbank.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class JointAccountHolder {

	
	@Id
	private int customerMID;
	private String Mname;
	
	@ManyToMany(targetEntity = AccountM.class, cascade = CascadeType.ALL)
	@JoinTable(name="Holder")
	List<AccountM> AccountM;

	public int getCustomerMID() {
		return customerMID;
	}

	public void setCustomerMID(int customerMID) {
		this.customerMID = customerMID;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public List<AccountM> getAccountM() {
		return AccountM;
	}

	public void setAccountM(List<AccountM> accountM) {
		AccountM = accountM;
	}
	

	
	
}
