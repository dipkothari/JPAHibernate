package com.emp.join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "edu")
public class edu {
	@Id
	private int eduid;
	private String name;
	public int getEduid() {
		return eduid;
	}
	public void setEduid(int eduid) {
		this.eduid = eduid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
