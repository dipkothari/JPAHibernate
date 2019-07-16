package com.bidirectional.wellbank.onetoone;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class cmr {
@Id
private int custid;
private String custName;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="doorno")
padd address;
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
public padd getAddress() {
	return address;
}
public void setAddress(padd address) {
	this.address = address;
}


}
