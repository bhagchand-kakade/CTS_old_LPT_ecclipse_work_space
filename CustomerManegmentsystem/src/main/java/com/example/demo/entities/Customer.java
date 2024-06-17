package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Customers")
public class Customer {

//	Customer Name , ID, Age , Address

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long ID;

	@Column
	private String Customer_name;

	@Column
	private int age;
	
	@Column
	private String address;

//	@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="ID")
//	private Address address;

	public Customer() {

	}

	public Customer(long iD, String customer_name, int age, String address) {
		super();
		this.ID = iD;
		this.Customer_name= customer_name;
		this.age = age;
		this.address = address;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", Customer_name=" + Customer_name + ", age=" + age + ", address=" + address
				+ "]";
	}

	
}
