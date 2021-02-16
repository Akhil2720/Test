package com.nttdata.bank;

import java.util.Scanner;



import java.util.Random;

public class Customer extends Account {

	public Customer(String customerName, int accountNumber, String mobileNumber, int pin, String address, int balance) {
		super(customerName, accountNumber, mobileNumber, pin, address, balance);
		// TODO Auto-generated constructor stub
	}
	
	Random random=new Random();
	Scanner scanner=new Scanner(System.in);
	String accountCreation() {
		
		System.out.println("Enter your name.");
		customerName=scanner.next();
		System.out.println("Enter Mobile Number: ");
		mobileNumber=scanner.next();
		System.out.println("Enter your Address: ");
		address=scanner.next();
		accountNumber=random.nextInt(10000);
		System.out.println("Set your pin: ");
		pin=scanner.nextInt();
		System.out.println("Enter the deposit amount: ");
		balance=scanner.nextInt();
		return "Account Created";
		
	}
	String displayCustomerDetails() {
		System.out.println("Hi "+customerName+ " ........Welcome... Here are Your details.");
		System.out.println("Account Number: "+accountNumber+" Mobile Number:  "+mobileNumber);
		System.out.println("Address: "+address+" Pin: "+pin);
		System.out.println("Remaining Balance: "+balance);
		return "Displayed";
	}
	int deposit() {
		int deposit=0;
		System.out.println("Enter Deposit Amount: ");
		deposit= scanner.nextInt();
		 return balance= balance+deposit;
		 
	}
	int withdrawl()
	{
		int withdrwal=0;
		System.out.println("Enter Withdrwal Amount: ");
		withdrwal = scanner.nextInt();
		if(withdrwal > balance) {
			System.out.println("Insufficent Funds..");
		}
		else {
		return balance= balance - withdrwal;
		}
		return 0;
	}
}
