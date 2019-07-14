package com.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class empper {
	public static void main(String args[]) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Fullemployee fe = new Fullemployee();
			fe.setEmpid(1001);
			fe.setName("deep");
			fe.setSalary(1200);
			
			em.persist(fe);
			
			PartEmployee pe = new PartEmployee();
			pe.setEmpid(1002);
			pe.setName("xyz");
			pe.setWage(200);
			
			em.persist(pe);
			
			em.getTransaction().commit();
		}
		finally {
			em.close();
		}
	}
}
