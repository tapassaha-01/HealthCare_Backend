package com.interrait.HealthCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testController {

	@RequestMapping("/")
	public String homPage() {
		return "home";
	}
	
}
