package com.verizontraining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EmailController {

	@GetMapping("/send-email")
	@HystrixCommand(fallbackMethod = "sendEmailFallback")
	public String sendEmail() {
		System.out.println("Email Has been sent");
		//throw new RuntimeException("Run Time Exception");
		return "Email sent successfully";
	}
	
	public String sendEmailFallback() {
		return "This is fallback message";
	}
}
