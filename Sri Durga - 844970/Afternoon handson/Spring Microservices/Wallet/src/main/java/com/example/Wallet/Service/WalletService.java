package com.example.Wallet.Service;

import com.example.Wallet.Model.AccountStructure;
import com.example.Wallet.Model.Wallet;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

	
	@Service
	public class WalletService {

		@Autowired
		private RestTemplate rest;
		
		public Wallet addAmountToWallet(long num) {
			Wallet wallet = new Wallet();
			AccountStructure account = rest.getForObject("http://ACCOUNT-SERVICE/account/"+num, AccountStructure.class);
			wallet.setBalance(wallet.getBalance()+(account.getAmount()*0.5));
			return wallet;

		}

		

	 	}


