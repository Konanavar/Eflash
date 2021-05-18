package com.bezkoder.spring.files.csv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
   @RequestMapping("/hi")
	public void sayHi() {
		System.out.println("test..");
	}

}
