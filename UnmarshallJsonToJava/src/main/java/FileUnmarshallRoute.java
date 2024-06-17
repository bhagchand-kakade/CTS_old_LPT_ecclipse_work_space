import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class FileUnmarshallRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// Sends file content to queue
		from("file:Files").log("${body}")
//		.to("jms:queue:Unmarshall::File")
				.to("jms:topic:PracticeAdd").log("Message sent on queue");

		from("jms:queue:PracticeAdd::Queue2").log("This is recieved message from queue2 ${body}");

		// Receives the message from queue and unmarshal it to Java object

		from("jms:queue:Filequeue1").log("Message ${body},Headers are: ${headers}")
//		.unmarshal().json(JsonLibrary.Jackson,Employee.class)
				.log("Message from queue ${body}");

	}

}
