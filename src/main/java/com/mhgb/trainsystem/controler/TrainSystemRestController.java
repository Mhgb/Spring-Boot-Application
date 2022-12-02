package com.mhgb.trainsystem.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainSystemRestController {

	@GetMapping("/")
	public String index () {
		return "Greetings from Train Booking System!";
	}
}
