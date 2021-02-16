package com.nttdata;

public class Bank {
	
	void greetUser() {
		System.out.println("Welcome to ABC Bank");
	}
	void transactionu1Tou2(User user1, User user2, double amount) {
		if(user1.getAccount().getAccountBalance()<amount) {
			try {
				throw new InsufficentBalance("You have insufficent balance");
				
			}
			catch(InsufficentBalance e) {
				e.printStackTrace();
			}
		}
		else {
			double u1=user1.getAccount().getAccountBalance()-amount;
			user1.getAccount().setAccountBalance(u1);
			
			double u2=user2.getAccount().getAccountBalance()+amount;
			user2.getAccount().setAccountBalance(u2);
			System.out.println("Balance of User 1 after transcation: "+user1.getAccount().getAccountBalance());
			System.out.println("Balance of User 2 after transcation: "+user2.getAccount().getAccountBalance());
			
		}
		
	}
	void transactionu2Tou1(User user1, User user2, double amount) {
		if(user2.getAccount().getAccountBalance()<amount) {
			try {
				throw new InsufficentBalance("You have insufficent balance");
				
			}
			catch(InsufficentBalance e) {
				e.printStackTrace();
			}
		}
		else {
			double u2=user2.getAccount().getAccountBalance()-amount;
			user2.getAccount().setAccountBalance(u2);
			
			double u1=user1.getAccount().getAccountBalance()+amount;
			user1.getAccount().setAccountBalance(u1);
			System.out.println("Balance of User 1 after transcation: "+user1.getAccount().getAccountBalance());
			System.out.println("Balance of User 2 after transcation: "+user2.getAccount().getAccountBalance());
		}
		
	}
	

}
