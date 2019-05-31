package com.karinderyapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karinderyapp.entity.Customer;
import com.karinderyapp.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	public List<Customer> getAllCustomer() {
		List<Customer> customerList = new ArrayList<>();
		customerRepo.findAll().forEach(customerList::add);
		return customerList;
	}

	public List<Customer> addCustomer(Customer vendor) {
		customerRepo.save(vendor);
		return getAllCustomer();
	}

	public Customer updateCustomer(Customer vendor) {
		customerRepo.save(vendor);
		return vendor;
	}

	public List<Customer> deleteCustomer(String id) {
		customerRepo.deleteById(Long.parseLong(id));
		return getAllCustomer();
	}
}
