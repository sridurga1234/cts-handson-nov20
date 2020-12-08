package com.example.ReponseEntity.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findAll();

	Customer save(Customer customer);

	Optional<Customer> findById(int id);

}