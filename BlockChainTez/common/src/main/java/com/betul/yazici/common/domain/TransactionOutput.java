package com.betul.yazici.common.domain;

import java.math.BigDecimal;
import java.security.PublicKey;

public class TransactionOutput {	
	private String id;
	private PublicKey reciepient; //also known as the new owner of these coins.
	private BigDecimal value; //the amount of coins they own
	private String transactionId; //the id of the transaction this output was created in
	
	public TransactionOutput(PublicKey reciepient, BigDecimal value, String transactionId) {
		this.reciepient = reciepient;
		this.value = value;
		this.transactionId = transactionId;
		//this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient)+Float.toString(value)+parentTransactionId);
	}
	
}
