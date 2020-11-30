package com.org;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
	
	int a=0;
	Service service = new Service();{
		
	do {
		System.out.println("Menu:/n 1.Add Account\n 2. Remove Account by account number\n 3.Display account by account number\n 4.Display all accounts\n5.Display those account having the balance less than 1000\n6.exit");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		switch(a) {
		case 1:System.out.println("Enter Account no");
				int accno=sc.nextInt();
				System.out.println("enter Account name:");
				String name=sc.next();
				System.out.println("enter Account Balance");
				int accbal= sc.nextInt();
			try {
				service.addAccount(new Accounts(accno,name,accbal));
			} catch (AccountAlreadyException e) {
				System.out.println("Duplicate account number");
			}
				break;
		case 2: System.out.println("Enter account no:");
			try {
				service.removeAccount(sc.nextInt());
			} catch (AccountNotFoundException e) {
				System.out.println("account  does not exist");
			}
				break;
		case 3: System.out.println("enter account by account no");
			try {
				service.getAccountByNo(sc.nextInt());
			} catch (AccountNotFoundException e) {
				System.out.println("account does not exist");
			}
				break;
		case 4: service.getAllaccounts();
				break;
		case 5:service.getAccountswithLowBalnce();
				break;
		
		}
	}while(a!=6);
}
}
}


