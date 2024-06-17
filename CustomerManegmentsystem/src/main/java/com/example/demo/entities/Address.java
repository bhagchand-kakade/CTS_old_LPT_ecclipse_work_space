//package com.example.demo.entities;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "address")
//public class Address {
//
//	@Id
//	@Column(name="ID")
//	private int ID;
//
//	@Column(name="City_name")
//	private String city;
//
//	@Column(name="zip_code")
//	private long zipcode;
//	
//	@OneToOne
//	private Customer customer;
//
//	public Address() {
//
//	}
//
//	public Address(int iD, String city, long zipcode) {
//		super();
//		ID = iD;
//		this.city = city;
//		this.zipcode = zipcode;
//	}
//
//	public int getID() {
//		return ID;
//	}
//
//	public void setID(int iD) {
//		ID = iD;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public long getZipcode() {
//		return zipcode;
//	}
//
//	public void setZipcode(long zipcode) {
//		this.zipcode = zipcode;
//	}
//
//	@Override
//	public String toString() {
//		return "Address [ID=" + ID + ", city=" + city + ", zipcode=" + zipcode + "]";
//	}
//	
//	
//
//}
