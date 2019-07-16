package com.WellsBank.Entity;

import javax.persistence.PostRemove;

public class projectlistner {
	
	@PostRemove
		

		public void display(Customer c) {

			System.out.println("deleteddd");
		}
}
	


