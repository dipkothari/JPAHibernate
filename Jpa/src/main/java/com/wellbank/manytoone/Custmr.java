package com.wellbank.manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Custmr {
@Id
private int cusid;
private String cusname;

@OneToMany(targetEntity = Act.class, mappedBy = "cm")
List account; 
public List getAccount() {
	return account;
}
public void setAccount(List account) {
	this.account = account;
}
public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
}
