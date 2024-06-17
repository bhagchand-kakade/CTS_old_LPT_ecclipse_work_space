import javax.json.Json;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class DemoRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// Sends file content to queue
		from("file:Files").log("${body}").to("jms:topic:Demo").log("Message sent on queue");

		/*
		 * from("jms:queue:DemoQue1").
		 * log("This is recieved message from Demo queue1 ${body}")
		 * .setHeader(Exchange.HTTP_METHOD,
		 * simple("GET")).to("http://localhost:8082/mobile");
		 */

//		 from("jms:queue:DemoQue2").log("Message ${body},Headers are: ${headers}")
//		.log("Message from Demo queue2 ${body}").setHeader(Exchange.HTTP_METHOD,
//		 simple("GET"))
//		.to("http://localhost:8082/mobile").log("HTTPresponse ${body}"); ;

		from("jms:queue:DemoQue2").log("Message ${body},Headers are: ${headers}")
		.removeHeader("Camel*")
		.log("Received JMS headrs are ${headers}")
				.log("Message from Demo queue2 ${body}").setHeader(Exchange.HTTP_METHOD, simple("POST"))
//				.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
				.marshal()
				.json(JsonLibrary.Jackson, Mobile.class).to("http://localhost:8082/mobile").log("HTTPresponse ${body}");

	}

}
