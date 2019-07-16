package com.wellbank.manytoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class actper {
	public static void main(String args[]) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			// many to one onedirectional
			
			
			
			/*
			 * Custmr c = new Custmr(); c.setCusid(1007); c.setCusname("dip");
			 * 
			 * Act a = new Act(); a.setActid(132); a.setActtype("saving"); a.setCm(c);
			 * 
			 * Act a1= new Act(); a1.setActid(134); a1.setActtype("current"); a1.setCm(c);
			 * 
			 * em.persist(a); em.persist(a1);
			 * 
			 * em.getTransaction().commit();
			 */
			
			
			//   Bidirectional many to one
			
			
			
			Custmr c=em.find(Custmr.class, 1007);
					List l =c.getAccount();
			Act a =  (Act) l.get(0);
			Act a1 = (Act) l.get(1);
			
			System.out.println(a.getActid());
			System.out.println(a1.getActid());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
