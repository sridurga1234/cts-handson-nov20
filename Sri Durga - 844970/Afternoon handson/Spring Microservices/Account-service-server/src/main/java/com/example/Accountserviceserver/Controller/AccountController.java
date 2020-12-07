package com.example.Accountserviceserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accountserviceserver.Dao.Account;
import com.example.Accountserviceserver.Service.AccountService;


@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/{accountnumber}")
	public Account fetchAccountById(@PathVariable("accountnumber") long accountNumber) {
		return accountService.fetchAccountByID(accountNumber);
	}
	
	@GetMapping("/hai")
	public String test() {
		return "hai";
	}
}