package com.Brand.Services;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Brand.entity.Brand;

public class BrandDb {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction et = em.getTransaction();
			et.begin();
		Brand b = new Brand();
		b.setBrandId(12014);
		b.setBrandName("baaaqwqwasaag");
		Calendar d = new GregorianCalendar(2005,11,05);
		b.setDateOfLunch(d);
		em.persist(b);
		et.commit();
		}
		catch(Exception e) {
			
		}
	}
}
