package com.emp.join;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tech")
public class tech extends edu{
	private int labsno;

	public int getLabsno() {
		return labsno;
	}

	public void setLabsno(int labsno) {
		this.labsno = labsno;
	}
	
}
