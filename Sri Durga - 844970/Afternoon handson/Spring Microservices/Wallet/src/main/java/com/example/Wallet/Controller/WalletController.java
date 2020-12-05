package com.example.Wallet.Controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.Wallet.Model.Wallet;
	import com.example.Wallet.Service.WalletService;

	
	@RestController
	@RequestMapping("/wallet")
	public class WalletController {

		@Autowired
		private WalletService walletService;
		
		@GetMapping("/{num}")
		public Wallet addAmountToWalletFromAccount(@PathVariable long num) {
			return walletService.addAmountToWallet(num);
		}
	}

