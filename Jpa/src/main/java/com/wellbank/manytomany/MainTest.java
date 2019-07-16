package com.wellbank.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {
	public static void main(String args[]) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			AccountM a1 = new AccountM();
			a1.setAbal(23000);
			a1.setAccountmId(1001);
			
			AccountM a2 = new AccountM();
			a2.setAbal(24000);
			a2.setAccountmId(1002);
			
			List<AccountM> list = new ArrayList<AccountM>();
			list.add(a1);
			list.add(a2);
			
			JointAccountHolder ja = new JointAccountHolder();
			ja.setAccountM(list);
			ja.setCustomerMID(1111);
			ja.setMname("deep");
			
			JointAccountHolder ja1 = new JointAccountHolder();
			ja1.setAccountM(list);
			ja1.setCustomerMID(2222);
			ja1.setMname("xyz");
			
			em.persist(ja);
			em.persist(ja1);

			em.getTransaction().commit();
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
