package com.assignment;

import java.util.Scanner;

public class AccountNumber {
	
	public int accountNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void accountNumberCreation() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your account number : ");
		accountNumber = sc.nextInt();
	}
	
	public static void main(String[] args) {
		AccountNumber ac = new AccountNumber();
		ac.accountNumberCreation();
	}

}
