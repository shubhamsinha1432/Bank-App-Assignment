package com.assignment;

public interface Actions {

	public abstract double withdraw(double amount);
	public abstract double deposit(double amount);
	public abstract void transfer(double amount, int accountNumber);
}
