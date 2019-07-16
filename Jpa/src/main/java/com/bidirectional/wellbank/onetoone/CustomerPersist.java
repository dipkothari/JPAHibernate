package com.bidirectional.wellbank.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersist {
	public static void main(String args[]) {
		padd p = new padd();
		p.setDoorno(102);
		p.setState("guj");
		
		cmr c = new cmr();
		c.setCustid(1002);
		c.setCustName("deep");
		c.setAddress(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oto");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			System.out.println("persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
			}
	}
}
