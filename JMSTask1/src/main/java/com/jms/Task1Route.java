package com.jms;

import org.apache.camel.builder.RouteBuilder;

public class Task1Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		//Sending message to address
		from("file:Files").log("${body}")
//		.to("jms:queue:POC1")
				.to("jms:topic:POC1").log("Message sent on queue");

		// Consumes message from Anycast queue
		//from("jms:queue:POC1::queue3").log("Message ${body},Headers are: ${headers}").log("Message from queue ${body}");
		
		// Consumes message from Anycast queue
		from("jms:queue:queue3").log("Message ${body},Headers are: ${headers}").log("Message from queue ${body}");

		// Consumes message from Multicastcast queue
		from("jms:queue:queue2").log("Message ${body},Headers are: ${headers}").log("Message from queue ${body}")
		.log("Message Consumed from Multicast queue");
	}

}
