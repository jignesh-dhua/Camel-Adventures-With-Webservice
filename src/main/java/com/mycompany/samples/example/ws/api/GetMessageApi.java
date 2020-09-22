package com.mycompany.samples.example.ws.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.mycompany.samples.example.ws.dto.Message;

@Component
public class GetMessageApi extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		rest("/getMessage")
		.enableCORS(true)
		.apiDocs(true)
		
		.get().produces("application/json").id("getMessage").outType(Message.class).to("direct:getMessage");		
	}

}
