package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {
	
	@GetMapping("/getEnquiries")
	public String getEnquiry()
	{
		return "No enquiryFound..!";
	}
	
	@PostMapping("/postData")
	public String postData()
	{
		return "Data Post Successfully";
	}

}
