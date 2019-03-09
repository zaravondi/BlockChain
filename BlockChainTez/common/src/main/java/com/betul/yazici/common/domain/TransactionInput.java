package com.betul.yazici.common.domain;

public class TransactionInput {
	
	private String outputId; //Reference to TransactionOutputs -> transactionId
	private TransactionOutput UTXO; //Contains the Unspent transaction output
	
	public TransactionInput(String outputId) {
		this.outputId = outputId;
	}

}
