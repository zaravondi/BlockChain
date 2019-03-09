package com.betul.yazici.wallet.service;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.betul.yazici.common.util.CryptoUtil;
import com.betul.yazici.wallet.request.SendAmountRequest;

@Service
public class DefaultWalletService implements WalletService {
	private PrivateKey privateKey;
	private PublicKey publicKey;
	
	@PostConstruct
	public void initialize() {
		KeyPair keyPair = CryptoUtil.generateKeyPair();
		this.privateKey = keyPair.getPrivate();
		this.publicKey = keyPair.getPublic();
	}

	@Override
	public void send(SendAmountRequest request) {
		
		
	}

	
}
