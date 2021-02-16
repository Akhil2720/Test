package com.nttdata.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String customerName = null;
		int accountNumber = 0;
		String mobileNumber = null;
		int pin = 0;
		String address = null;
		int balance = 0;
		int value=0;
		Customer customer =new Customer(customerName, accountNumber, mobileNumber, pin, address, balance);
		Scanner scanner= new Scanner(System.in);
		
		do {
			System.out.println("Welcome....Enter your Choice of Banking....");
			System.out.println("-------------------------------");
			System.out.println("1. Create Account 2.View Details 3.Deposit 4.Withdrawl 5.Exit");
			 value= scanner.nextInt();
			switch (value){
				case 1:	
						customer.accountCreation();
						break;
				case 2:	customer.displayCustomerDetails();
						break;
				case 3:
						customer.deposit();
						System.out.println(" Deposited Succefully. Remaining balance "+customer.balance);
						break;
						
				case 4:	customer.withdrawl();
						System.out.println("Withdrawed Successfully. Remaining Balance "+ customer.balance);
						break;
				case 5:System.out.println("Thank you for banking with us...");
						break;
				
				default : System.out.println("Invalid Input.....Enter Values between 1 to 5 only...");
				
			}
		}while(value != 5);

	}


}
