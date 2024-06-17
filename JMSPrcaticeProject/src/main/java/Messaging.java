import org.apache.camel.builder.RouteBuilder;

public class Messaging extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		 
		from("timer:mytimer?delay=6000&period=10s")
		.log("Timer component Started")
		//.setHeader("SessionID",constant(123))
		.setBody(simple("This is the test message sending to the queue "))
		.log("Sending the message to the queue")
		//.to("jms:queue:TestMessage")
		.to("jms:topic:TopicJms")
		.log("Test message sent")
//		.log("Message: ${body}")
		;
	}

}
