package com.mycompany.samples.example.ws.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet")//.bindingMode(RestBindingMode.json)
        // and output using pretty print
        .dataFormatProperty("prettyPrint", "true")
        // setup context path and port number that netty will use
        .contextPath("/").port(8080)
        // add swagger api-doc out of the box
        .apiContextPath("/api-doc")
            .apiProperty("api.title", "Message API")
            .apiProperty("api.version", "1.2.3")
            // and enable CORS
            .apiProperty("cors", "true");		
	}

}
