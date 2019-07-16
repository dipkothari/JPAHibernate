package com.emp.join;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class edujoin {
	public static void main(String args[]) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("edujoin");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			tech t = new tech();
			t.setEduid(1003);
			t.setName("xyzz");
			t.setLabsno(10);
			
			em.persist(t);

			evangellist el = new evangellist();
			el.setEduid(1004);
			el.setName("abcc");
			el.setSessionno(20);
			
			em.persist(el);
	
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
