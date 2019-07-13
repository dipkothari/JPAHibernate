package com.WellsBank.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.WellsBank.Entity.Customer;

public class CustomerDao {
	public static void main(String args[]) throws Exception{
		int customerId;
		String customerName;
		
		System.out.println("Enter the customer ID");
		customerId = Integer.parseInt(args[0]);
		
		System.out.println("Enter the customer Name");
		customerName = args[1];
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Customer c = new Customer();
		c.setCustomerId(customerId);
		c.setCustomerName(customerName);
		em.persist(c);
		em.getTransaction().commit();
		System.out.println("Persisted");
	}
}

