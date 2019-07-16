package com.wellbank.onotoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class onotooneDB {
	public static void main(String args[]) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			PermanentAddress pr = new PermanentAddress();
			pr.setDoorno(101);
			pr.setState("gujarat");
			
			Customer c = new Customer();
			c.setAddress(pr);
			c.setCustid(1001);
			c.setCustName("deep");
			em.persist(c);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
