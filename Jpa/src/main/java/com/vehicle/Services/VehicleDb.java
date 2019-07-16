package com.vehicle.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vehicle.entity.Vehicle;
import com.vehicle.entity.VehiclePk;

public class VehicleDb {
	public static void main(String args[]) throws Exception{
		EntityManager em = null;
	
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle");
			em= emf.createEntityManager();
			em.getTransaction().begin();
			
			
			// set composite value
			
			
			
		
		 Vehicle v = new Vehicle(); v.setVehicleid(1071); v.setOwnerid(171);
		  v.setPrice(2000.0); v.setName("abcdx"); em.persist(v);
		 em.getTransaction().commit();
		 
			
			//find composite 
			
		/*
		 * VehiclePk pk = new VehiclePk(); pk.setOwnerid(11); pk.setVehicleid(1001);
		 * 
		 * Vehicle v = em.find(Vehicle.class, pk);
		 * 
		 * if(v == null) { System.out.println("no data"); } else {
		 * System.out.println(v.getName() + " " + v.getPrice()); }
		 */
		
	}
}
