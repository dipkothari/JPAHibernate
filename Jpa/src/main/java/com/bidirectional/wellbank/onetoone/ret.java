package com.bidirectional.wellbank.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ret {
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oto");
		EntityManager em = emf.createEntityManager();
		/*
		 * padd p1 = em.find(padd.class, 101); cmr c1 = p1.getCustomer();
		 * System.out.println(c1.getCustid()); System.out.println(c1.getCustName());
		 * System.out.println("detail of 101 retrived");
		 */
		padd p2 = em.find(padd.class, 102);
		cmr c2 = p2.getCustomer();
		System.out.println(c2.getCustid());
		System.out.println(c2.getCustName());
		System.out.println("detail of 102 retrived");
	}
}
