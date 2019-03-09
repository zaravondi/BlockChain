package com.betul.yazici.node.service;

import java.util.List;

import com.betul.yazici.common.domain.Transaction;

public interface TransactionService {
	void addTransaction(Transaction transaction);

	List<Transaction> getTransactions();
}
