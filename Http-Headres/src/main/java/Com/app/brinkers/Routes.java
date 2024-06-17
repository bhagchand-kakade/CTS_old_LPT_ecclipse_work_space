package Com.app.brinkers;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

public class Routes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		
//		from("direct:start")
//		  .setHeader(Exchange.HTTP_URI, constant("http://newhost"))
//		  .to("http://oldhost");
//		
//		
//		from("direct:start")
//		  .setHeader(Exchange.HTTP_QUERY, constant("order=123&detail=short"))
//		  .to("http://oldhost");

//		from("direct:start")
//		  .setHeader(Exchange.HTTP_METHOD, constant(org.apache.camel.component.http.HttpMethods.POST))
//		  .to("http://www.google.com")
//		  .log("Test message ${headers}")
//		  .to("mock:results");

		from("timer://foo?fixedRate=true&delay=0&period=10000&repeatCount=1")
				.setHeader(Exchange.HTTP_METHOD, constant(org.apache.camel.component.http.HttpMethods.POST))
				.setBody().constant("cameltext")
				.to("http://www.google.com").log("Test message ${headers}").to("file:target/google");

		from("direct:start").removeHeaders("*", "CamelMessageTimestamp", "CamelHttpResponseCode")
				.log("Test message ${headers}")
		// .to("smtp://....")
		;
	}

}
