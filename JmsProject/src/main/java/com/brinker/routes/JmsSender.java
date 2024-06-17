package com.brinker.routes;

import javax.inject.Inject;
import javax.jms.ConnectionFactory;

import org.apache.camel.builder.RouteBuilder;

public class JmsSender extends RouteBuilder {
	@Inject
	ConnectionFactory connectionFactory;

	@Override
	public void configure() throws Exception {

		from("timer:timer123?delay=6000&period=10s")
		.log("Timer route started ")
		.setHeader("SessionID",constant(123))
		.setBody(simple("Sending First message from sender "))
		.log("Sending Message")
		.to("jms:queue:JMSPractice?deliveryMode=2")
		.log("Message Sent");

	}

}
