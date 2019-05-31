package com.karinderyapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karinderyapp.entity.Vendor;
import com.karinderyapp.repository.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepo;

	public List<Vendor> getAllVendor(String area) {
		return vendorRepo.findByArea(area);
	}

	public List<Vendor> addVendor(Vendor vendor) {
		vendorRepo.save(vendor);
		return getAllVendor(vendor.getArea());
	}

	public Vendor updateVendor(Vendor vendor) {
		vendorRepo.save(vendor);
		return vendor;
	}

	public void deleteVendor(String id) {
		vendorRepo.deleteById(Long.parseLong(id));
	}
}
