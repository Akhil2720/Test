package com.nttdata.Interface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Lapotop Name: ");
		String laptopName= input.next();
		System.out.println("Enter the Lapotop price: ");
		double laptopPrice= input.nextDouble();
		System.out.println("Enter the Lapotop RAM: ");
		String laptopRam= input.next();
		
		System.out.println("Enter the Mobile Name: ");
		String mobileName= input.next();
		System.out.println("Enter the Mobile price: ");
		double mobilePrice= input.nextDouble();
		System.out.println("Enter the Mobile RAM: ");
		String mobileRam= input.next();
		
		System.out.println("Enter the Tab Name: ");
		String tabName= input.next();
		System.out.println("Enter the Tab price: ");
		double tabPrice= input.nextDouble();
		System.out.println("Enter the Tab RAM: ");
		String tabRam= input.next();
		
		
		ElectronicDevice laptop= new Laptop(laptopName, laptopPrice, laptopRam);
		ElectronicDevice mobile= new Mobile(mobileName, mobilePrice, mobileRam);
		ElectronicDevice tab= new Tab(tabName, tabPrice, tabRam);
		
		laptop.details();
		laptop.turnOn();
		laptop.charging();
		laptop.turnOff();
		 System.out.println("---------------------------------");
		 
		mobile.details();
		mobile.turnOn();
		mobile.charging();
		mobile.turnOff();
		
		System.out.println("---------------------------------");
		tab.details();
		tab.turnOn();
		tab.charging();
		tab.turnOff();
	}

}
