package com.betul.yazici.node.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betul.yazici.common.domain.Transaction;
import com.betul.yazici.node.service.TransactionService;

@RestController
@RequestMapping(path = "/transactions", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {
	private final TransactionService service;
	
	@Autowired
	public TransactionController(TransactionService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<String> addTransaction(@RequestBody @Valid Transaction transaction) {
		service.addTransaction(transaction);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(consumes = MediaType.ALL_VALUE)
	public ResponseEntity<List<Transaction>> getTransactions() {
		return ResponseEntity.ok(service.getTransactions());
	}
	
}
