package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerManegmentsystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@MockBean
	private CustomerRepository customerRepository;

	@Test
	public void test_getAllCustomers() {
		when (customerRepository.findAll()).thenReturn(Stream.of(new Customer(1,"Ram",25,"Mumbai"),new Customer(2,"Sham",27,"Dhelhi")).collect(Collectors.toList()));
		assertEquals(2, customerRepository.findAll().size());
	}
	
	@Test
	public void testaddCustomer() {
		Customer customer=new Customer(1,"Punit",20,"Adegaon");
		when(customerRepository.save(customer)).thenReturn(customer);
		assertEquals(customer,customerRepository.save(customer));
	}
	

	
}
