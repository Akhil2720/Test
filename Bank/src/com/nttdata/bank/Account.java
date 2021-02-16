package com.nttdata.bank;

public class Account {

	String customerName;
	int accountNumber;
	String mobileNumber;
	int pin;
	String address;
	int balance;
	static int withdrawl = 0;
	public Account(String customerName, int accountNumber, String mobileNumber, int pin, String address, int balance) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.pin = pin;
		this.address = address;
		this.balance = balance;
	}
	
	
	
	
	
}
