package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Car;

public interface CarRepository extends CrudRepository<Car,Integer> {
	
	public Iterable<Car>deleteByCompanyname(String companyname);
	public Car findByCompanyname(String companyname);
	

}
