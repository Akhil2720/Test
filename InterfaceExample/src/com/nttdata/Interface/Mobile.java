package com.nttdata.Interface;

public class Mobile implements ElectronicDevice {
	String mobileName;
	double mobilePrice;
	String mobileRam;
	

	public Mobile(String mobileName, double mobilePrice, String mobileRam) {
		super();
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
		this.mobileRam = mobileRam;
	}
	
	String getMobileName() {
		return mobileName;
		
	}
	String getMobileRam() {
		return mobileRam;
	}
	
	double getMobilePrice() {
		return mobilePrice;
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The "+mobileName+" Has turned On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The "+mobileName+" Has turned Off");
		
	}

	@Override
	public void charging() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Has dash charging.");
		
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("The Mobile name is "+mobileName+" and Has a Ram of "+mobileRam+" is priced at "+mobilePrice+" Rupees");
		System.out.println("With Chage of Electron: "+ElectronicDevice.CHARGEOFELECTRON+" And Input AC Supply of: "+ElectronicDevice.INPUTAC);
		
	}

}
