package com.customer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
@NamedQueries({
@NamedQuery(name = "findname" , query = "select s from Customer s where s.name like 'd%'"),
@NamedQuery(name = "deletename" , query = "delete from Customer s where s.name=?1")
})
public class Customer {
@Id
private int id;
private String name;
private String city;
private String state;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
}
