package com.karinderyapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.karinderyapp.entity.Customer;
import com.karinderyapp.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//get all customer
	@RequestMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	//add a new customer
	@RequestMapping(method=RequestMethod.POST, value = "/customer")
	public List<Customer> addCustomer(@RequestBody Customer customer){
		return customerService.addCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id) {
		return customerService.updateCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customer/{id}")
	public List<Customer> deleteCustomer( @PathVariable String id) {
		return customerService.deleteCustomer(id);
	}

}
