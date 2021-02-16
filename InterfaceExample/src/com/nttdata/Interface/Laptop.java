package com.nttdata.Interface;

public class Laptop implements ElectronicDevice {
	
	String laptopName;
	double laptopPrice;
	String laptopRam;
	

	public Laptop(String laptopName, double laptopPrice, String laptopRam) {
		super();
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopRam = laptopRam;
	}
	
	String getLaptopName() {
		return laptopName;
		
	}
	String getLaptoRam() {
		return laptopRam;
	}
	
	double getLaptopPrice() {
		return laptopPrice;
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The "+laptopName+" Has turned On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The "+laptopName+" Has turned Off");
		
	}

	@Override
	public void charging() {
		// TODO Auto-generated method stub
		System.out.println("Laptop Has dual Engine charging.");
		
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("The Laptop name is "+laptopName+" and Has a Ram of "+laptopRam+" is priced at "+laptopPrice+" Rupees");
		System.out.println("With Chage of Electron: "+ElectronicDevice.CHARGEOFELECTRON+" And Input AC Supply of: "+ElectronicDevice.INPUTAC);
		
	}

	
}
