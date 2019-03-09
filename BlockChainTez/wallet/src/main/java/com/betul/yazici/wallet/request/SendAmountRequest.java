package com.betul.yazici.wallet.request;

import java.math.BigDecimal;

public class SendAmountRequest {
	private String receipent;
	private BigDecimal amount;
	public String getReceipent() {
		return receipent;
	}
	public void setReceipent(String receipent) {
		this.receipent = receipent;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	

}
