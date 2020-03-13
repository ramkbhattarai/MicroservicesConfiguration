package com.rkb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("${app.description}")
	private String greetingMessageWithAppName; // we can refer the key value pair within application.properties as we have seen here
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage +"......."+ greetingMessageWithAppName;
	}

}
