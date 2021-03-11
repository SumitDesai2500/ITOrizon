package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private CarService service;
	
	@PostMapping("/save-car")
	@Transactional
	@CrossOrigin
 public String registerCar(@RequestBody Car car) {
	 service.saveCar(car);
	return "hello Mr.Bean    "  +car.getCompanyname()+ "    Car registeration is successful";
	 
 }
	
	@GetMapping("/all-cars")
	@CrossOrigin
	public Iterable<Car> showAllCars(){
		return service.showAllCars();
		
	}
	
	@GetMapping("/delete/{companyname}")
	@Transactional
	@CrossOrigin
	public Iterable<Car> deleteCar(@PathVariable String companyname){
		return service.deleteCarByCompanyname(companyname);
	}
	
	@GetMapping("/search/{companyname}")
	@CrossOrigin
	public Car searchCar(@PathVariable String companyname) {
		return service.findByCompanyname(companyname);
	}

	
	

}
