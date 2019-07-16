package com.wellbank.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountM {
@Id
private int AccountmId;
private double Abal;
public int getAccountmId() {
	return AccountmId;
}
public void setAccountmId(int accountmId) {
	AccountmId = accountmId;
}
public double getAbal() {
	return Abal;
}
public void setAbal(double abal) {
	Abal = abal;
}


}
