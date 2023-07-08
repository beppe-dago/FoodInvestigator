package com.dago.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FoodController {
	
	@GetMapping("hello")
	public ResponseEntity<SimpleResponse> hello() {
		SimpleResponse response = new SimpleResponse();
		response.setMessage("Hello");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
