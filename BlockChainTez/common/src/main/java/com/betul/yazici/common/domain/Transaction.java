package com.betul.yazici.common.domain;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private String id;
	private OffsetDateTime lockTime;
	private BigDecimal value; //Contains the amount we wish to send to the recipient.
	private byte[] signature; //This is to prevent anybody else from spending funds in our wallet.
	
	private List<TransactionInput> inputs = new ArrayList<>();
	private List<TransactionOutput> outputs = new ArrayList<>();
	private PublicKey sender; //Senders address/public key.
	private PublicKey reciepient; //Recipients address/public key.
	
	public Transaction(PublicKey from, PublicKey to, BigDecimal value,  List<TransactionInput> inputs) {
		this.sender = from;
		this.reciepient = to;
		this.value = value;
		this.inputs = inputs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OffsetDateTime getLockTime() {
		return lockTime;
	}

	public void setLockTime(OffsetDateTime lockTime) {
		this.lockTime = lockTime;
	}
	
	

}
