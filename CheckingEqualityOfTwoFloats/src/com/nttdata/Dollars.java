package com.nttdata;

import java.util.Scanner;

public class Dollars {
	public static void main(String[] args) {
		System.out.println("Enter the value: ");
		Scanner scanner= new Scanner(System.in);
		float value= scanner.nextFloat();
		System.out.println("One "+value+" Franc equals to "+value/6.85062+" Dollars");
		
	}

}
