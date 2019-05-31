package com.karinderyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karinderyapp.entity.Vendor;
import com.karinderyapp.services.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	//get all vendor
	@RequestMapping("/vendor/{area}")
	public List<Vendor> getAllVendor(@PathVariable String area){
		return vendorService.getAllVendor(area);
	}
	
	//add a new vendor
	@RequestMapping(method=RequestMethod.POST, value = "/vendor")
	public List<Vendor> addVendor(@RequestBody Vendor vendor){
		return vendorService.addVendor(vendor);
	}
	
	//update vendor
	@RequestMapping(method=RequestMethod.PUT, value="/vendor/{id}")
	public Vendor updateVendor(@RequestBody Vendor vendor, @PathVariable String id) {
		return vendorService.updateVendor(vendor);
	}
	
	//delete a vendor
	@RequestMapping(method=RequestMethod.DELETE, value="/vendor/{id}")
	public void deleteVendor( @PathVariable String id) {
		vendorService.deleteVendor(id);
	}

}
