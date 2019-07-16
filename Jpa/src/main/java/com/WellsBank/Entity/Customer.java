package com.WellsBank.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity

@EntityListeners(projectlistner.class)
@Table(name = "cust")
public class Customer {
	public Customer() {
		super();
	}
	@Id
	@Column (name = "custd")
	private int customerId;
	@Column (name = "custName")
	private String customerName;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	//pre persist
	@PrePersist
	public void beforePersist(){
		System.out.println("before persisting");
	}
	
	//post persist
	
	@PostPersist
	public void afterPersist() {
		System.out.println("After persisting");
	}
	
	
}


