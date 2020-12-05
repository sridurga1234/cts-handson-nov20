package com.org;

import java.util.ArrayList;
import java.util.List;

public class Service {
	List<Accounts> lis = new ArrayList<Accounts>();
	public void addAccount(Accounts a) throws AccountAlreadyException
	{
		for(Accounts acc : lis) {
			if(acc.getAccountno()==a.getAccountno())
				throw new AccountAlreadyException();
			
			
		}
		lis.add(a);
	}
	public void removeAccount(int num) throws AccountNotFoundException {
		Accounts reaccount = null;
		for (Accounts account : lis) {
			if(account.getAccountno()==num)
				reaccount=account;
		}
		if(reaccount==null)
			throw new AccountNotFoundException();
		else {
			for (Accounts account : lis) {
				if(account.getAccountno()==num)
					account.remove(account);
			}}
		
	}
	public void getAccountByNo(int num) throws AccountNotFoundException {
		Accounts reaccount = null;
		for (Accounts account : lis) {
			if(account.getAccountno()==num)
				reaccount=account;
		}if(reaccount==null)
			throw new AccountNotFoundException();
		else
			System.out.println(reaccount);
	}
	public void getAllaccounts() {
		lis.stream().forEach(i->System.out.println(i));
	}
	public void getAccountswithLowBalnce() {
		lis.stream().forEach(i->{if(i.getAccountBalance()<1000) System.out.println(i);});
	}
	
}
