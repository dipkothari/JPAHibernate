package com.vehicle.entity;

import java.io.Serializable;

public class VehiclePk implements Serializable {
	private int vehicleid;
	private int ownerid;
	
	public VehiclePk() {
		super();
	}
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ownerid; result = prime * result + vehicleid;
	 * return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; VehiclePk other = (VehiclePk) obj; if (ownerid != other.ownerid)
	 * return false; if (vehicleid != other.vehicleid) return false; return true; }
	 */
	
	

	
}
