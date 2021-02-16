package com.nttdata;

public class PrevelidgeCustomer extends Customer {
	int valueAddedPoints;

	public PrevelidgeCustomer(String customerId, String customerName, String customerAddress, double price,
			int valueAddedPoints) {
		super(customerId, customerName, customerAddress, price);
		this.valueAddedPoints = valueAddedPoints;
	}
	void totalBill() {
		System.out.println("Name of the customer: "+customerName+"\t Customer Id: "+customerId+"\t Customer Address: "+customerAddress);
		System.out.println("Value added points: "+valueAddedPoints);
		if(valueAddedPoints>=30) {
			System.out.println("Hurray!! You get 20 Percent discount...");
			System.out.println("Total Bill is: "+price*0.2);
		}
		
		
	}

}
