package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {

	@GetMapping(value = "/")
	public String getValue() {
		System.out.println("reached here before timeer");
		try {
			Thread.sleep(240000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("reached here after timeer");
		return "****************************helloworld";
	}

}
