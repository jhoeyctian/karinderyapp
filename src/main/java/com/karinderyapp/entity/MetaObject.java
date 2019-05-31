package com.karinderyapp.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class MetaObject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Calendar created = Calendar.getInstance();
	private Calendar deleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated() {
		this.created = Calendar.getInstance();
	}

	public Calendar getDeleted() {
		return deleted;
	}

	public void setDeleted(Calendar deleted) {
		this.deleted = deleted;
	}

}
