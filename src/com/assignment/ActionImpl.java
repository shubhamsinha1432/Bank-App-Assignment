package com.assignment;

public class ActionImpl implements Actions{

	public double balance;
	
	public double getBalance() {
		return balance;
	}

	public ActionImpl(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double withdraw(double amount) {
		if(balance>amount) {
			balance = balance - amount;
			System.out.println("RS."+amount+" is withdrawl from your account");
		}else {
			System.out.println("Insufficient balance please refill your account");
		}
		return balance;
	}

	@Override
	public double deposit(double amount) {
		balance = balance + amount;
		System.out.println("RS."+amount+" is deposited in your account");
		return balance;
		
	}

	@Override
	public void transfer(double amount,int accountNumber) {
		if(balance>amount) {
			balance = balance - amount;
			System.out.println("RS."+amount+" Money has transfered successfully to Account No. : "+accountNumber);
		}else {
			System.out.println("Insufficient balance please refill your account");
		}
		
	}

}
