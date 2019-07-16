package com.Brand.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "brand")
public class Brand {
	@Id
	private int brandId;
	@Column 
	private String brandName;
	 @Temporal(TemporalType.DATE)
	private Calendar dateOfLunch;
	public Brand() {
		super();
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Calendar getDateOfLunch() {
		return dateOfLunch;
	}
	public void setDateOfLunch(Calendar dateOfLunch) {
		this.dateOfLunch = dateOfLunch;
	}
	

}
