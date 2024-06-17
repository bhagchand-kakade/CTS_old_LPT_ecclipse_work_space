package com.brinker.routes;

import javax.inject.Inject;
import javax.jms.ConnectionFactory;

import org.apache.camel.builder.RouteBuilder;

public class FirstRoute extends RouteBuilder {

	@Inject
	ConnectionFactory connectionFactory;

	@Override
	public void configure() throws Exception {

	from("jms:queue:JMSPractice?allowNullBody=true&jmsMessageType=text").log("New message: ${body} , Headers are: ${headers}");

	}

}
