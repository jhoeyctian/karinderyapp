package com.karinderyapp.entity;

import javax.persistence.Entity;

@Entity
public class Customer extends MetaObject {

	private String name;
	private String area; // MAKATI or BGC
	private String phone;

	public Customer() {
	}
	
	public Customer(String name, String area, String phone) {
		super();
		this.name = name;
		this.area = area;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
