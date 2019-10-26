package org.springframework.gs_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

	@RequestMapping("/")
	public String index() {
		
		return "Greetings from Spring Boot!";
	
	}
	
}
