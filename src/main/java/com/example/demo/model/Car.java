package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytablee")
public class Car {
	
	@Id
	private int id;
	private String companyname;
	private String carmodel;                             
	private String carcolor;
	private Date Dateofpurchase ;
	private Double Price ;
	
	public  Car() {}
	
	public Car(int id, String companyname, String carmodel, String carcolor, Date dateofpurchase, Double price) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.carmodel = carmodel;
		this.carcolor = carcolor;
		Dateofpurchase = dateofpurchase;
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarcolor() {
		return carcolor;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	public Date getDateofpurchase() {
		return Dateofpurchase;
	}
	public void setDateofpurchase(Date dateofpurchase) {
		Dateofpurchase = dateofpurchase;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", companyname=" + companyname + ", carmodel=" + carmodel + ", carcolor=" + carcolor
				+ ", Dateofpurchase=" + Dateofpurchase + ", Price=" + Price + "]";
	}


}
