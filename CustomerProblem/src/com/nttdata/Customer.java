package com.nttdata;

public class Customer {
	
	String customerId;
	String customerName;
	String customerAddress;
	double price;
	
	public Customer(String customerId, String customerName, String customerAddress, double price) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.price = price;
	}
	
	void totalBill() {
		System.out.println("Name of the customer: "+customerName+"\t Customer Id: "+customerId+"\t Customer Address: "+customerAddress);
		System.out.println("Total Bill is: "+price);
		
	}

}
