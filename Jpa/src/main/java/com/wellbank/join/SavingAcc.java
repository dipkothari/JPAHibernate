package com.wellbank.join;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="savingacc")
public class SavingAcc extends acc {

	private int minbalance;
	
	public int getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(int minbalance) {
		this.minbalance = minbalance;
	}
	
	

}
