package com.assignment;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		AccountNumber acno = new AccountNumber();
		acno.setAccountNumber();
		System.out.println("Account Number : " + acno.getAccountNumber());

		AccountHolderDetails details = new AccountHolderDetails(10, "Shubham Sinha", 23, 25000, "shubh@gmail.com",
				123456790);
		System.out.println("AcHolderId : " + details.getId());
		System.out.println("AcHolderName : " + details.getName());
		System.out.println("Age : " + details.getAge());
		System.out.println("Salary : " + details.getSalary());
		System.out.println("E-mail : " + details.getEmail());
		System.out.println("Phone : " + details.getPhoneNo());
		System.out.println("=======================================");

		ActionImpl actionImpl = new ActionImpl(15000);
		System.out.println("Current Balance : RS." + actionImpl.getBalance());
		System.out.println("=======================================");

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose 1 for Deposit");
		System.out.println("Choose 2 for Withdraw");
		System.out.println("Choose 3 for Tranfer Money");
		System.out.println("Choose 4 for Check Balance");
		System.out.println("Choose 5 for EXIT");
		System.out.print("Choose the operation you want to perform:");

		int option = sc.nextInt();
		System.out.println("=======================================");
		switch (option) {
		case 1:
			System.out.print("Enter amount to be deposited:");
			int dAmount = sc.nextInt();
			actionImpl.deposit(dAmount);
			System.out.println("Current Balance : RS." + actionImpl.getBalance());
			System.out.println("=======================================");
			break;
		case 2:
			System.out.print("Enter amount to be withdrawn:");
			int wAmount = sc.nextInt();
			actionImpl.withdraw(wAmount);
			System.out.println("Current Balance : RS." + actionImpl.getBalance());
			System.out.println("=======================================");
			break;
		case 3:
			System.out.print("Enter destintion Bank Account Number : ");
			int destAccountNo = sc.nextInt();
			System.out.print("Enter Amount : ");
			int amount = sc.nextInt();

			actionImpl.transfer(amount, destAccountNo);
			System.out.println("Current Balance : RS." + actionImpl.getBalance());
			break;
		case 4:
			System.out.println("Balance : " + actionImpl.getBalance());
			System.out.println("");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong choice Please enter the correct option.");
			break;
		}
	}
}
