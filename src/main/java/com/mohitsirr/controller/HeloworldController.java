package com.mohitsirr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloworldController {
	@GetMapping("/message")
	public String getmessage() {
		return "hello world";
	}

}
