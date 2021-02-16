package com.nttdata.Interface;

public interface ElectronicDevice {
	
	double CHARGEOFELECTRON = 1.6E-19;
	String INPUTAC ="240 Volts 60 Hz";
	
	void details();
	void turnOn();
	void turnOff();
	void charging();
	
	

}
