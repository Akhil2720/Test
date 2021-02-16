package com.nttdata;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Integer, Cars> map= new TreeMap();
		
		map.put(101, new Cars(500000,"Maruthi","24 KMPL"));
		map.put(102, new Cars(600000,"Hyundai","20 KMPL"));
		map.put(103, new Cars(700000,"Honda","18 KMPL"));
		map.put(104, new Cars(800000,"Audi","11 KMPL"));
		Scanner scanner= new Scanner(System.in);
		System.out.println("Welcome to cars Website..");
		System.out.println("Models:  101 102 103 104 ");
		System.out.println("Enter 5 to Exit.");
		int choice=0;
		while(choice != 5) {
			System.out.println("Enter the Model Number: ");
			
			
		 choice= scanner.nextInt();
		if(map.containsKey(choice)) {
			System.out.println("Car Details: "+map.get(choice));
			continue;
		}
		}
	}

}
