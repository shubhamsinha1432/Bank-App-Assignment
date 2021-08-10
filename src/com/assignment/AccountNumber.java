package com.assignment;

import java.util.Scanner;

public class AccountNumber {

	public int accountNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your account number : ");
		accountNumber = scanner.nextInt();
	}

}
