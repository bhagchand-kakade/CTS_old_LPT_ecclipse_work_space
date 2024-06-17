package com.example.demo;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.classes.Employee;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		try {
            
            ClassPathXmlApplicationContext springCtx = new ClassPathXmlApplicationContext("database-context.xml");

            CamelContext context = springCtx.getBean("employeeContext", CamelContext.class);

            context.start();

            ProducerTemplate producerTemplate = context.createProducerTemplate();

            // Insert Employee 1
            Employee emp1 = getEmployee1();
            String resp = producerTemplate.requestBody("direct:insert", emp1, String.class);

            // Insert Employee 2
            Employee emp2 = getEmployee2();
            resp = producerTemplate.requestBody("direct:insert", emp2, String.class);

            // Get Employee of inserted employees
            List<Employee> employees = producerTemplate.requestBody("direct:select", null, List.class);
            System.out.println("employees:" + employees);

        }
        catch (Exception e) {

            e.printStackTrace();

        }
    }

    private static Employee getEmployee1() {

        Employee emp = new Employee();

        emp.setFirstname("Firstname");
        emp.setMiddlename("Middlename");
        emp.setLastname("Lastname");
        emp.setAge("Age");
        emp.setCandidateid("Candidateid");
        return emp;

    }

    private static Employee getEmployee2() {

        Employee emp = new Employee();

        emp.setFirstname("Firstname");
        emp.setMiddlename("Middlename");
        emp.setLastname("Lastname");
        emp.setAge("Age");
        emp.setCandidateid("Candidateid");
        return emp;

    }
	}


