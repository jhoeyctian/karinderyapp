package com.karinderyapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.karinderyapp.entity.Building;
import com.karinderyapp.entity.Vendor;

public interface BuildingRepository extends CrudRepository<Building, Long> {
	public List<Building> findByArea(String area);
}
