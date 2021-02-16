package com.nttdata;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Customer Id: ");
		String customerId= input.next();
		System.out.println("Enter Customer Name: ");
		String customerName= input.next();
		System.out.println("Enter Customer Address: ");
		String customerAddress=input.next();
		System.out.println("Enter Price: ");
		double price = input.nextDouble();
		System.out.println("Enter Value added points: ");
		int valueAddedpoints= input.nextInt();
		Customer customer=new Customer(customerId, customerName, customerAddress,price);
		PrevelidgeCustomer pcustomer= new PrevelidgeCustomer(customerId, customerName, customerAddress, price, valueAddedpoints);
		//customer.totalBill();
		pcustomer.totalBill();
		
	}
}
