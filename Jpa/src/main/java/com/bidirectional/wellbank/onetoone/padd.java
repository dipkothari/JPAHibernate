package com.bidirectional.wellbank.onetoone;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class padd {
@Id
	private int doorno;
	private String state;
	@OneToOne(mappedBy="address")
	cmr customer;
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public cmr getCustomer() {
		return customer;
	}
	public void setCustomer(cmr customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "PermanentAddress [doorno=" + doorno + ", state=" + state + ", customer=" + customer + "]";
	}
	
	
}
