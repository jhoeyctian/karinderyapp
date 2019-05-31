package com.karinderyapp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vendor extends MetaObject {

	private String name;
	private String area; // MAKATI or BGC
	private String phone;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="vendorbldgs",
    	joinColumns={@JoinColumn(name="vendor_id")},
    	inverseJoinColumns={@JoinColumn(name="building_id")})
	Set<Building> building = new HashSet<>();

	public Vendor() {
	}
	
	public Vendor(String name, String area, String phone) {
		super();
		this.name = name;
		this.area = area;
		this.phone = phone;
	}

	public Set<Building> getBuilding() {
		return building;
	}

	public void setBuilding(Set<Building> building) {
		this.building = building;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//TODO add enumValidator
//	@EnumValidator
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
