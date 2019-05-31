package com.karinderyapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Building extends MetaObject {

	private String building;
	private String area; //MAKATI or BGC
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="building")
	Set<Vendor> vendor = new HashSet<>();
	
	public Building() {
	}
	
	public Building(String building, String area) {
		super();
		this.building = building;
		this.area = area;
	}
	
	public Set<Vendor> getVendor() {
		return vendor;
	}

	public void setVendor(Set<Vendor> vendor) {
		this.vendor = vendor;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
