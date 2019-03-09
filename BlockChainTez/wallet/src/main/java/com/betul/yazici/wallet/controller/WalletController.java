package com.betul.yazici.wallet.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betul.yazici.wallet.request.SendAmountRequest;
import com.betul.yazici.wallet.service.WalletService;

@RestController
@RequestMapping(path = "/wallet", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class WalletController {
	
	private final WalletService service;

	@Autowired
	public WalletController(WalletService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<String> send(@RequestBody SendAmountRequest request) {
		service.send(request);
		return ResponseEntity.ok().build();
	}

}
