package com.karinderyapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.karinderyapp.entity.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
	public List<Vendor> findByArea(String area);
}
