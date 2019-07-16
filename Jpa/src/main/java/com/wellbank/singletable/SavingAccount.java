package com.wellbank.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("saving")
public class SavingAccount extends Account {
	private int minbalance;
	private double interestrate;
	public int getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(int minbalance) {
		this.minbalance = minbalance;
	}
	public double getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}
	

}
