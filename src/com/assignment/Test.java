package com.assignment;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		AccountNumber acno=new AccountNumber();
		acno.accountNumberCreation();
		System.out.println("Account Number : "+acno.getAccountNumber());
		AccountHolderDetails details=new AccountHolderDetails(10, "Shubham", 23, 25000, "shubh@gmail.com", 123456790);
		System.out.println("AcHolderId : "+details.getId());
		System.out.println("AcHolderName : "+details.getName());
		System.out.println("Age : "+details.getAge());
		System.out.println("Salary : "+details.getSalary());
		System.out.println("E-mail : "+details.getEmail());
		System.out.println("Phone : "+details.getPhoneNo());
		System.out.println("=======================================");
		
		ActionImpl actionImpl = new ActionImpl(15000);
		System.out.println("Current Balance : RS."+actionImpl.getBalance());
		System.out.println("=======================================");
		
		actionImpl.deposit(1500);
		System.out.println("Current Balance : RS."+actionImpl.getBalance());
		System.out.println("=======================================");
		
		actionImpl.withdraw(2000);
		System.out.println("Current Balance : RS."+actionImpl.getBalance());
		System.out.println("=======================================");
		
		//Transfer funds from current account to another account
		System.out.print("Enter destintion Bank Account Number : ");
		Scanner sc= new Scanner(System.in);
		int destAccountNo=sc.nextInt();
		System.out.print("Enter Amount : ");
		int amount=sc.nextInt();
		actionImpl.transfer(amount,destAccountNo);
		System.out.println("Current Balance : RS."+actionImpl.getBalance());

	}

}
