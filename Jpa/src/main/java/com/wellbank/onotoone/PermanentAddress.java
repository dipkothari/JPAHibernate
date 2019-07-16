package com.wellbank.onotoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PermanentAddress {
	@Id
	private int Doorno;
	private String state;
	public int getDoorno() {
		return Doorno;
	}
	public void setDoorno(int doorno) {
		Doorno = doorno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
