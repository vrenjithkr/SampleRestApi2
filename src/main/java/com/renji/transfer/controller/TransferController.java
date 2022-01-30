package com.renji.transfer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transfer")
public class TransferController {

	@PostMapping
	public ResponseEntity<String> doTransafer() {
		return new ResponseEntity<>("Transaction is initiated", HttpStatus.OK);
	}



}
