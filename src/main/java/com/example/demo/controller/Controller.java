package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class Controller {

	public String start() {
		return "/index";
	}
	
}
