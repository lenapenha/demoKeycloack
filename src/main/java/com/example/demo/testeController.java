package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testeController {

	@GetMapping("/test")
	public ResponseEntity<String> retornaTest() {
		return new ResponseEntity("Minha API Retornou OK ;)", HttpStatus.OK);
	}
}
