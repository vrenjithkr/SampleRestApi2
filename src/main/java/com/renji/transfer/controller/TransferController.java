package com.renji.transfer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renji.bank.model.Transaction;

@RestController
@RequestMapping("/api/v1/transfer")
public class TransferController {

	@PostMapping
	public ResponseEntity<Transaction> doTransafer(@RequestBody Transaction transaction) {
		transaction.setStatus("Transaction is initiated");
		return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
	}



}
