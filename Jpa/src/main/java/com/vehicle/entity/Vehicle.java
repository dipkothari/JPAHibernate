package com.vehicle.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity

@IdClass(VehiclePk.class)
public class Vehicle {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * 
	 * @SequenceGenerator(name = "vehicle", sequenceName = "vehicle", initialValue =
	 * 1001, allocationSize = 10)
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle")
	 */
@Id
	private int vehicleid;


@Id
	private int ownerid;

	private double price;

	private String name;

	public Vehicle() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
