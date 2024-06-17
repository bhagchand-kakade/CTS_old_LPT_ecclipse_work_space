import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class RestConsumerRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:newtimer?period=10s")
		.log("calling rest API...")
		.setHeader(Exchange.HTTP_METHOD,simple("GET"))
		.to("http://localhost:8082/mobile")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				String output = exchange.getIn().getBody(String.class);
				System.out.println("Output is = "+output);
				
			}
		});
	}

}
