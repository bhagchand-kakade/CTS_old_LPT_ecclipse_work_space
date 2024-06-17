package com.example.demo.classes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class EmployeeMap {
	public Map<String, Object> getMap(Employee employee) {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("Firstname", employee.getFirstname());
        answer.put("Middlename", employee.getMiddlename());
        answer.put("Lastname", employee.getLastname());
        answer.put("Age", employee.getAge());
        answer.put("CandidateId", employee.getCandidateid());
        return answer;

}

	public List<Employee> readEmployees(List<Map<String, String>> dataList) {

        System.out.println("data:" + dataList);

        List<Employee> employees = new ArrayList<Employee>();

        for (Map<String, String> data : dataList) {

            Employee employee = new Employee();

            employee.setFirstname(data.get("Firstname")); 
            employee.setMiddlename(data.get("Middletname"));
            employee.setLastname(data.get("Lastname"));
            employee.setAge(data.get("Age"));
            employee.setCandidateid(data.get("CandidateId"));

            employees.add(employee);
        }

        return employees;
    }
}