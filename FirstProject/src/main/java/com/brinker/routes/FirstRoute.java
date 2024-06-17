package com.brinker.routes;

import javax.inject.Inject;
import javax.jms.ConnectionFactory;

import org.apache.camel.builder.RouteBuilder;

public class FirstRoute extends RouteBuilder {

	@Inject
	ConnectionFactory connectionFactory ;
	
	@Override
	public void configure() throws Exception {
		
		
		// TODO Auto-generated method stub

//		from("timer:foo?period=1000").log("Hello Quarkus ");
//
//		rest().get("/hello-world").produces("MediaType.APPLICATION_JSON_VALUE").route()
//				.setBody(constant("Welcome to Camel rest API")).endRest();

		// ActvieMQ
		from("jms:queue:queue1?allowNullBody=true&jmsMessageType=text").log("New message: ${body}");

//		rest(basepath)
//	     .post(gcValidationEndpoint)
//	     .type(GCRequest.class)
//	     .route();
	}

}
