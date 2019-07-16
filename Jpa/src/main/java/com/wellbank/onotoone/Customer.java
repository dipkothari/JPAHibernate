package com.wellbank.onotoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.engine.internal.Cascade;

@Entity
public class Customer {
	@Id
	private int custid;
	private String custName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Doorno")
	PermanentAddress address;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public PermanentAddress getAddress() {
		return address;
	}
	public void setAddress(PermanentAddress address) {
		this.address = address;
	}
	
}
