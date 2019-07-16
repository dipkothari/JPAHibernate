package com.emp.join;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "el")
public class evangellist extends edu{
	private int sessionno;

	public int getSessionno() {
		return sessionno;
	}

	public void setSessionno(int sessionno) {
		this.sessionno = sessionno;
	}
	
	
}
