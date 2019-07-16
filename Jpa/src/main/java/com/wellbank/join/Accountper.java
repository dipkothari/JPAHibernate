package com.wellbank.join;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Accountper {
	public static void main(String args[]) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("join");
			em=emf.createEntityManager();
			em.getTransaction().begin();
			
			SavingAcc sa = new SavingAcc();
			sa.setAccountno(1007);
			sa.setBalance(1000.0);
			sa.setMinbalance(500);
			
			em.persist(sa);
			
			LoanAcc la = new LoanAcc();
			la.setAccountno(1009);
			la.setBalance(1200.0);
			la.setLoanAmount(200);
			
			
			em.persist(la);
			
			em.getTransaction().commit();
			
			System.out.println("Persisted");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
