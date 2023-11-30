package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/test1")
	public String testjsp1() {
		return "testjsp1";
	}
	
	@GetMapping("/test2")
	public String testjsp2() {
		return "subJsp/testjsp2";
	}

}
