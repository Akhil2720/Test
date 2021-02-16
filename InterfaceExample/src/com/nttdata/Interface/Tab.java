package com.nttdata.Interface;

public class Tab implements ElectronicDevice {
	
	String tabName;
	double tabPrice;
	String tabRam;
	

	public Tab(String tabName, double tabPrice, String tabRam) {
		super();
		this.tabName = tabName;
		this.tabPrice = tabPrice;
		this.tabRam = tabRam;
	}
	
	String getTabName() {
		return tabName;
		
	}
	String getTabRam() {
		return tabRam;
	}
	
	double getTabPrice() {
		return tabPrice;
	}
	

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The "+tabName+" Has turned On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The "+tabName+" Has turned Off");
		
	}

	@Override
	public void charging() {
		// TODO Auto-generated method stub
		System.out.println("Tab Has dual dash charging.");
		
	}

	public void details() {
		// TODO Auto-generated method stub
		System.out.println("The Tab name is "+tabName+" and Has a Ram of "+tabRam+" is priced at "+tabPrice+" Rupees");
		System.out.println("With Chage of Electron: "+ElectronicDevice.CHARGEOFELECTRON+" And Input AC Supply of: "+ElectronicDevice.INPUTAC);
		
	}


}
