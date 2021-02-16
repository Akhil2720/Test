package com.nttdata;

import java.util.Scanner;
import com.nttdata.User;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String userName;
		String userAddress;
		int accountId;
		double accountBalance;
		Bank bank=new Bank();
		User user1=new User();
		User user2=new User();
		bank.greetUser();
		int choice=0;
		
		do {
			System.out.println("Enter your choice 1. Accounts creation 2. Transaction from user1 to user2");
			System.out.println("3. Transcation from user2 to user1 4. Exit");
		
			choice=scanner.nextInt();
			
			switch (choice) {
			case 1:	System.out.println("Enter User 1 details...");
				System.out.println("Enter accountID: ");	
				accountId=scanner.nextInt();
				System.out.println("Enter accountBalance: ");	
				accountBalance=scanner.nextInt();
				Account account1=new Account(accountId, accountBalance);
				System.out.println("Enter userName: ");	
				userName=scanner.next();
				System.out.println("Enter userAddress: ");	
				String useraddress=scanner.next();
				user1= new User(userName, useraddress, account1);
				System.out.println("=========================");
				System.out.println("Enter User 2 details");
				System.out.println("Enter accountID: ");	
				int accountId2=scanner.nextInt();
				System.out.println("Enter accountBalance: ");	
				double accountBalance2=scanner.nextInt();
				Account account2=new Account(accountId2, accountBalance2);
				System.out.println("Enter userName: ");	
				String userName2=scanner.next();
				System.out.println("Enter userAddress: ");	
				String useraddress2=scanner.next();
				user2= new User(userName2, useraddress2, account2);
				break;
				
		
		case 2:	
				System.out.println("Enter transfer amount:");
				double amount= scanner.nextDouble();
				bank.transactionu1Tou2(user1, user2, amount);
				break;
		
		
		case 3: 
				System.out.println("Enter transfer amount:");
				amount= scanner.nextDouble();
				bank.transactionu2Tou1(user1, user2, amount);
				break;
		case 4: System.out.println("Thank You");		
		default: System.out.println("Enter valid option. ");
				
		}
		
	}while(choice!=4);
		
	
		
	}

}
