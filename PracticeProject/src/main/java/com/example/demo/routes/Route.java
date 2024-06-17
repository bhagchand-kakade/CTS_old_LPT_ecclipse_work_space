package com.example.demo.routes;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Route extends RouteBuilder {

	@Autowired
	private GetCurrentDateTimeBean getCurrentDateTimeBean;

	@Override
	public void configure() throws Exception {

		// Timer component
		from("timer:my-first-timer").log("${body}").transform().constant("Timer Component").log("${body}")
				.bean(getCurrentDateTimeBean, "GettimeNow").log("${body}").to("log:my-first-timer");

		// File component to read file
		from("file:files/JSON").log("${body}");

		// File component to move file from input to output
		from("file:files/input").log("${body}").to("file:files/output");
		
		from("ftp://rider.com/orders?username=rider&password=secret").to("jms:incomingOrders");
		
		

	}

}

@Component
class GetCurrentDateTimeBean {
	public String GettimeNow() {
		return "Time now is" + LocalDateTime.now();
	}
}
