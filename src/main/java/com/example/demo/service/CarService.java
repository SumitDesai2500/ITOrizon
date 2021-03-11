package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository repo;
 
	public CarService () {}
	public CarService(CarRepository repo) {
		super();
		this.repo = repo;
	}
	public void saveCar(Car car) {
		repo.save(car);
	}
	public Iterable<Car> showAllCars(){
		return repo.findAll();
	}
	public Iterable<Car> deleteCarByCompanyname(String companyname) {
		repo.deleteByCompanyname(companyname);
		return repo.findAll();
	}
	public Car findByCompanyname(String companyname) {
		return repo.findByCompanyname(companyname);
	}
	

}
