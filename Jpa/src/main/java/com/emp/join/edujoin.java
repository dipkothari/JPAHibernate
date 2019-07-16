package com.emp.join;

import javax.persistence.EntityManager;
<<<<<<< HEAD

=======
>>>>>>> 7d2f66b86693b394e0eaa1a31f21846d08cf2893
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
<<<<<<< HEAD
			t.setEduid(1003);
			t.setName("xyzz");
			t.setLabsno(10);
=======
			t.setEduid(1001);
			t.setName("xyz");
			t.setLabsno(1);
>>>>>>> 7d2f66b86693b394e0eaa1a31f21846d08cf2893
			
			em.persist(t);

			evangellist el = new evangellist();
<<<<<<< HEAD
			el.setEduid(1004);
			el.setName("abcc");
			el.setSessionno(20);
=======
			el.setEduid(1002);
			el.setName("abc");
			el.setSessionno(2);
>>>>>>> 7d2f66b86693b394e0eaa1a31f21846d08cf2893
			
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
