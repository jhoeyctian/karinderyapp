package com.karinderyapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karinderyapp.entity.Building;
import com.karinderyapp.repository.BuildingRepository;

@Service
public class BuildingService {

	@Autowired
	private BuildingRepository buildingRepo;

	public List<Building> getAllBuilding(String area) {
		return buildingRepo.findByArea(area);
	}

	public List<Building> addBuilding(Building vendor) {
		buildingRepo.save(vendor);
		return getAllBuilding(vendor.getArea());
	}

	public Building updateBuilding(Building vendor) {
		buildingRepo.save(vendor);
		return vendor;
	}

	public void deleteBuilding(String id) {
		buildingRepo.deleteById(Long.parseLong(id));
	}
}
