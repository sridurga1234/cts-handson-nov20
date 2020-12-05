package com.org;

public class Accounts {
	private int Accountno;
	private String AccountName;
	private int AccountBalance;
	public Accounts(int accountno, String accountName, int accountBalance) {
		super();
		Accountno = accountno;
		AccountName = accountName;
		AccountBalance = accountBalance;
	}
	public int getAccountno() {
		return Accountno;
	}
	public void setAccountno(int accountno) {
		Accountno = accountno;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Accounts [Accountno=" + Accountno + ", AccountName=" + AccountName + ", AccountBalance="
				+ AccountBalance + "]";
	}
	public void remove(Accounts account) {
		// TODO Auto-generated method stub
		
	}
	

}
