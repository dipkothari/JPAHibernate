package com.WellsBank.Services;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.WellsBank.Entity.Customer;

public class CustomerDao {
	public static void main(String args[]) throws Exception{
		int customerId;
		String customerName;
		EntityManager em = null;
		
		
		System.out.println("Enter the customer ID");
		customerId = Integer.parseInt(args[0]);
		
		
		/*
		 * System.out.println("Enter the customer Name");
		 * 
		 * customerName = args[1];
		 */
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//Insert the data to database
		/*
		 * Customer c = new Customer(); c.setCustomerId(customerId);
		 * c.setCustomerName(customerName); em.persist(c); em.getTransaction().commit();
		 * System.out.println("Persisted");
		 */
		 
		 
		 
		
		 //get the data from database
		 
		/* Customer c = em.find(Customer.class, customerId); */
		/*
		 * if(c==null) { System.out.println("sorry no data"); } else {
		 * System.out.println(c.getCustomerName()); }
		 */
		
		 



		 Customer c = em.find(Customer.class, customerId);

		 
		  // remove data from database
		 em.remove(c); em.getTransaction().commit(); 
		 System.out.println("time for finally");
		}
		finally {
			System.out.println("will close");
			em.close();
			System.out.println("em close");
		}
		
	}
	
}

