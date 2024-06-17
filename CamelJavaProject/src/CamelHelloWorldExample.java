import org.apache.camel.builder.RouteBuilder;

public class CamelHelloWorldExample {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();
        try {
	context.addRoutes(new RouteBuilder() {
                public void configure() throws Exception {
                    from("activemq:queue:test.queue")
                    .to("stream:out");
                }  } );
	context.start();
Thread.sleep(2000);
        } finally {
            context.stop();
        } } }
