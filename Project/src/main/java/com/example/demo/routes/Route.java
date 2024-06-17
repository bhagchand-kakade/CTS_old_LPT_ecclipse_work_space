package com.example.demo.routes;

import java.util.Set;

import org.apache.camel.CamelContext;

//import javax.sql.DataSource;

import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.JsonLibrary;
//import org.apache.camel.support.SimpleRegistry;
import org.springframework.stereotype.Component;

import com.example.demo.classes.Employee;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
@Component
public class Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {

//		MysqlDataSource DataSource=new MysqlDataSource();
//		DataSource.setURl("jdbc:mysql://localhost:3306/project");

//		SimpleRegistry registry=new SimpleRegistry();
//		registry.put("myDataSource", DataSource);
//		
//		CamelContex context = new DefaultCamelContext(registry);
//		from("file:files/Details")///Project/Files/Details.json
		from("file:files/JSON").log("${body}").unmarshal().json(JsonLibrary.Jackson, Employee.class)
				// .to("sql:INSERT INTO employee(firstname, middlename, lastname, age,
				// Candidateid) VALUES (:#firstname,:#middlename, :#lastname, :#age,
				// :#Candidateid)");
				.log("${body}");
//				.bean("employeeMap", "getMap")
//				.to("sqlComponent:{{INSERT INTO employee(FirstName, middleName, lastName, age, CandidateId) VALUES (:#FirstName,:#middleName, :#lastName, :#age, :#CandidateId)}}");

//		from("direct:insert")
//        .log("Add Employee")
//        .bean("EmployeeList", "getEmployees")
//        .to("sqlComponent:{{INSERT INTO employee(firstname, middlename, lastname, age, Candidateid) VALUES (:#firstname,:#middlename, :#lastname, :#age, :#Candidateid)}}");

		/*
		 * SQL part
		 */
//
		from("direct:insert").log("Inserted new Employee").bean("employeeMap", "getMap")
				.to("sqlComponent:{{sql.insertEmployee}}");

		from("direct:select").to("sqlComponent:{{sql.getAllEmployee}}").bean("employeeMap", "readEmployees")
				.log("${body}");
	}

	

}
