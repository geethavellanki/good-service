package com.good.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Good")
public class GoodController {

	@GetMapping("/good")
	public String good() {
		return "service is good";
	}
}
