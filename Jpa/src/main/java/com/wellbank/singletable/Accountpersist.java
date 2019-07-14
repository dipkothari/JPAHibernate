package com.wellbank.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Accountpersist {
	public static void main(String args[]) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("single");
			em=emf.createEntityManager();
			em.getTransaction().begin();
			
			SavingAccount sa = new SavingAccount();
			sa.setAccountno(1005);
			sa.setBalance(1000.0);
			sa.setInterestrate(12.22);
			sa.setMinbalance(500);
			em.persist(sa);
			
			LoanAccount la = new LoanAccount();
			la.setAccountno(1006);
			la.setBalance(1200.0);
			la.setLoanAmount(200);
			la.setLoanType("car loan");
			
			em.persist(la);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
