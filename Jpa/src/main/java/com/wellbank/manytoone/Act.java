package com.wellbank.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Act {
@Id
private int actid;
private String acttype;

@ManyToOne(cascade = CascadeType.ALL,targetEntity = Custmr.class)
@JoinColumn(name = "cusid")
Custmr cm;



public Custmr getCm() {
	return cm;
}
public void setCm(Custmr cm) {
	this.cm = cm;
}
public int getActid() {
	return actid;
}
public void setActid(int actid) {
	this.actid = actid;
}
public String getActtype() {
	return acttype;
}
public void setActtype(String acttype) {
	this.acttype = acttype;
}

}
