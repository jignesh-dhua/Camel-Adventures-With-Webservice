package com.mycompany.samples.example.ws;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetMessageRoute extends RouteBuilder {

	@Autowired
	private LogRoutePolicy logRoutePolicy;
	
	
	@Override
	public void configure() throws Exception {
	
		from("direct:getMessage")
		.routePolicy(logRoutePolicy)
		.routeId("GetMessageRoute")
		.log("Received Request")
		.log("Waiting...")
		.delay(10000) //Delay in milli
		
		.setBody(constant("{\"message\": \"Hello World\"}"))
		.log("Sending Response :: ${body}");
	}

}
