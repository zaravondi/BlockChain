package com.betul.yazici.wallet.service;

import com.betul.yazici.wallet.request.SendAmountRequest;

public interface WalletService {

	void send(SendAmountRequest request);

}
