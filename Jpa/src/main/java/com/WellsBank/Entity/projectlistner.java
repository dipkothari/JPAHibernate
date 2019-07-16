package com.WellsBank.Entity;

import javax.persistence.PostRemove;

public class projectlistner {
	
	@PostRemove
<<<<<<< HEAD
		public void display(cus c) {
=======
		public void display(Customer c) {
>>>>>>> 7d2f66b86693b394e0eaa1a31f21846d08cf2893
			System.out.println("deleteddd");
		}
	

}
