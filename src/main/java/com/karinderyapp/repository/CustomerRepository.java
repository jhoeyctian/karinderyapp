package com.karinderyapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.karinderyapp.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
