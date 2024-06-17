import javax.inject.Inject;
import javax.jms.ConnectionFactory;

import org.apache.camel.builder.RouteBuilder;

public class FromQueue extends RouteBuilder {

	@Inject
	ConnectionFactory connectionFactory;

	@Override
	public void configure() throws Exception {

		from("jms:queue:TestMessage?allowNullBody=true&jmsMessageType=text")
				.log("Message ${body},Headers are: ${headers}");

		from("jms:queue:TopicJms::Test1")
		.log("Message Subscriber message body ${body},Headers are: ${headers}");
	}

}
