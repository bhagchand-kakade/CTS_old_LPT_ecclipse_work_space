package com.example.demo.classes;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {

	@Autowired
	private GetCurrentDateTimeBean getCurrentDateTimeBean;

	@Override
	public void configure() throws Exception {
		from("timer:my-first-timer")
		.log("${body}")
		.transform().constant("My message")
		.log("${body}")
		//.transform().constant("Time now is"+LocalDateTime.now())
		//.bean("getCurrentDateTimeBean")
		.bean(getCurrentDateTimeBean,"GettimeNow")
		.log("${body}")
		.to("log:my-first-timer");
		
//		from("file:src/data?noop=true")Chitra 30 ​
//
//				.choice()​
//
//				       .when(xpath("/person/city = 'London'”)")​
//
//				  .to("file:target/messages/uk") ​
//
//				      .otherwise() ​
//
//				.to("file:target/messages/others"); 
		
		//public void configure() throws Exception{​

//			from("timer://foo? repeatCount=2").routeId("firstRoute")​
//
//			from("Quartz2:{{quartz.cron}}&file:{{sourcefile}}?noop=true&move={{}}​)"
//			.to("sql:.select * from projects?DataSource=dataSource")
//			.bean(Example.class,"method1");
//			from("C:\\in\\MyFile.txt?noop=true&delete=true").routeId("secondRoute")
//			.to("C:\\archive\\MyFile.txt")
//			.bean(Example.class,"method1")
//			.to("sql:.select * from projects?DataSource=dataSource")
//			.log("the current body content ${body}");
		
		
//		from("file:C:/inputFolder").split().tokenize("\n").to("jms:queue:example.demo.classes");​
//
//		from("jms:queue:example.demo.classes").​
//
//		.process(new Processor(){​})​
//
//		.to("sql:insert into students (id,name) into( :#id,:#name)​​​");
		
		
		
//		from("file:C:/inputFolder").split().tokenize("\n").to("direct:test");    ​
//
//		from("direct:test"). choice().when(body().contains("")) .to("jms:queue:javainuse1")​
//
//		.when(body().contains("javainuse2")) .to("jms:queue:javainusejavainuse12")​
//
//		.when(body().contains("javainuse3")).to("jms:queue:javainuse3")​
//
//		        .otherwise(). to("jms:queue:otherwise");​
	}

}

@Component
class GetCurrentDateTimeBean {
	public String GettimeNow() {
		return "Time now is" + LocalDateTime.now();
	}
}