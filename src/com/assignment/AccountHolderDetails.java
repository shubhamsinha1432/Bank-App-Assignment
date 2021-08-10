package com.assignment;

public class AccountHolderDetails {

	private int id;
	private String name;
	private int age;
	private int salary;
	private String email;
	private int phoneNo;

	public AccountHolderDetails(int id, String name, int age, int salary, String email, int phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

}
