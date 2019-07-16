package com.WellsBank.Entity;

import javax.persistence.PostRemove;

public class projectlistner {
	
	@PostRemove
		public void display(cus c) {
			System.out.println("deleteddd");
		}
	

}
