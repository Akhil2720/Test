package com.nttdata;

public class Cars {

	double price;
	String carName;
	String milage;
	public Cars(double price, String carName, String milage) {
		super();
		this.price = price;
		this.carName = carName;
		this.milage = milage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Cars [price=" + price + ", carName=" + carName + ", milage=" + milage + "]";
	}

	
}
