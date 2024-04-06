package com.cjc.main.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {
	
	@GetMapping("/getEnquiries")
	public String getEnquiry()
	{
		return "No enquiryFound..!";
	}

	@PutMapping("/updateData")
	public String updateData()
	{
		return "Data updated successfully...!";

	}
	@PostMapping("/postData")
	public String postData()
	{
		return "Data Post Successfully";
	}
	@DeleteMapping("/delete Api")
	public void deleteAll()
	{
		System.out.println("Delete from tabale");
	}
}
