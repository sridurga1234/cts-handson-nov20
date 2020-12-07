package com.example.Accountserviceserver.Service;

import org.springframework.stereotype.Service;

import com.example.Accountserviceserver.Dao.Account;


@Service
public class AccountService {

	@SuppressWarnings("deprecation")
	public Account fetchAccountByID(long accountNumber) {
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(new Double(Math.random()*accountNumber).intValue());
		return account;
	}

}