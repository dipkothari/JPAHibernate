package com.customer.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class jpqldemo1 {
	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql1");
		EntityManager em =null;
		em = emf.createEntityManager();
		try {
			
			
			em.getTransaction().begin();
			
			
			//Fetching Entities
			/* Query q = em.createQuery("select c from Customer c"); */
			
			
			
			//Named and Positional Parameter
			
			/*
			 * Query q = em.createQuery("select c from Customer c where c.id=?2");
			 * q.setParameter(2, id);
			 */
			
			
			// update 
			
			
			/*
			 * Query q =
			 * em.createQuery("update Customer c set c.name=:name where c.id=:id");
			 * q.setParameter("name", name); q.setParameter("id", id); int UpdateCountOutput
			 * = q.executeUpdate();
			 */
			
			
			
			Query query = em.createNamedQuery("findname");  
			Query q = em.createNamedQuery("deletename");
			q.setParameter(1, "dk");
			 q.executeUpdate();
	        @SuppressWarnings("unchecked")
			List<Customer> list =query.getResultList();  
	        
	          for(Customer s:list) {  
	                
	             System.out.println(s.getId()+" \t"+s.getName());
	            
	          }
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
