package com.betul.yazici.node.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

import com.betul.yazici.common.domain.Transaction;

@Service
public class DefaultTransactionService implements TransactionService {
	private final SortedMap<String, Transaction> transactions;
	
	public DefaultTransactionService() {
		transactions = new TreeMap<String, Transaction>();
	}

	@Override
	public void addTransaction(Transaction transaction) {
		transactions.put(transaction.getId(), transaction);
	}

	@Override
	public List<Transaction> getTransactions() {
		return new ArrayList<>(transactions.values());
	}
	
	
}
