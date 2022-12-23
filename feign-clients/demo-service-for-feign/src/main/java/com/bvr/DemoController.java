package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/servicename") 
	public String getServiceName() {
		return "Welcome : Oracle Service";
	}
	
	
	@GetMapping("/serviceaddress") 
	public String getServiceAddrss() {
		return "Location : Oracle Bangalore";
	}
	
		
	@GetMapping("/servicedetails")
	public String getServiceDetails() {
		return "Microservices using Spring boot and Spring cloud";
	}
	
			
}
