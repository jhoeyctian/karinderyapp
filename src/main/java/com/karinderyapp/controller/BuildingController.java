package com.karinderyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karinderyapp.entity.Building;
import com.karinderyapp.services.BuildingService;

@RestController
public class BuildingController {
	
	@Autowired
	private BuildingService buildingService;
	
	//get all building
	@RequestMapping("/building/{area}")
	public List<Building> getAllBuilding(@PathVariable String area){
		return buildingService.getAllBuilding(area);
	}
	
	//add a new building
	@RequestMapping(method=RequestMethod.POST, value = "/building")
	public List<Building> addBuilding(@RequestBody Building building){
		return buildingService.addBuilding(building);
	}
	
	//update building
	@RequestMapping(method=RequestMethod.PUT, value="/building/{id}")
	public Building updateBuilding(@RequestBody Building building, @PathVariable String id) {
		return buildingService.updateBuilding(building);
	}
	
	//delete a building
	@RequestMapping(method=RequestMethod.DELETE, value="/building/{id}")
	public void deleteBuilding( @PathVariable String id) {
		buildingService.deleteBuilding(id);
	}

}
