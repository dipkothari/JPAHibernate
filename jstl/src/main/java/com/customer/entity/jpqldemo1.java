package com.customer.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.result.UpdateCountOutput;

public class jpqldemo1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql1");
		EntityManager em = emf.createEntityManager();
		
		try {
			int id =3;
			String name = "dk";
			
			em.getTransaction().begin();
			//Fetching Entities
			/* Query q = em.createQuery("select c from Customer c"); */
			//Named and Positional Parameter
			/*
			 * Query q = em.createQuery("select c from Customer c where c.id=?2");
			 * q.setParameter(2, id);
			 */
			Query q = em.createQuery("update Customer c set c.name=:name where c.id=:id");
			q.setParameter("name", name);
			q.setParameter("id", id);
			int UpdateCountOutput = q.executeUpdate();
			
			em.getTransaction().commit();
			
			/*
			 * List rs = q.getResultList(); int size = rs.size();
			 * 
			 * for(int i=0; i<size;i++) { Customer c = (Customer) rs.get(i);
			 * System.out.print(c.getId()); System.out.print(c.getName());
			 * System.out.print(c.getCity()); System.out.println(c.getState()); }
			 */
			
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
