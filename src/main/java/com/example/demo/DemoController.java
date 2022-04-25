package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messaging")
public class DemoController {

@GetMapping(
		    path = "/message",
		    params = {"name"})
		public String getMessage(
		        @RequestParam final String name) {
	
		  return "Hello " + name+"!!!";
		    
		}
}
