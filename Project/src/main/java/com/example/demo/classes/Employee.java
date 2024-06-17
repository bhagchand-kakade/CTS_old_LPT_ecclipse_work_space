package com.example.demo.classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	/*
	 * • Read from json  
	 * • Unmarshall to java object 
	 * • Call SQL
	 * component to insert the data(can use split component and oracle or
	 * InMemory-h2 database) 
	 * • Hit an existing Rest service available in online and
	 * get the response ,print it in logs(Consider using 2 or more routes in route
	 * class to implement the logic)
	 * 
	 * 
	 */

	/*
	 * "firstname": "firstnamevalue", "middlename": "middlenamevalue",
	 * "lastname”:"lastnamevalue", "age":"agevalue",
	 * "Candidateid":"candidateid value"
	 */

	private String firstname;
	private String middlename;
	private String lastname;
	private String age;
	private String Candidateid;
	
	
	// Parameterized Constructor to initialize the values to default
	public Employee() {
		
	}
	public Employee(String firstname, String middlename, String lastname, String age, String Candidateid) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.age = age;
		this.Candidateid = Candidateid;
	}

	// Generated setters and getters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCandidateid() {
		return Candidateid;
	}

	public void setCandidateid(String Candidateid) {
		this.Candidateid = Candidateid;
	}

	// Override the to string method to get the expected output
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", age="
				+ age + ", Candidateid=" + Candidateid + "]";
	}

}
