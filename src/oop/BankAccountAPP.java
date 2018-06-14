package oop;

public class BankAccountAPP {

	public static void main(String[] args) {
		//Creating a new bank account >> Think Instantiate an object
		BankAccount acc1 = new BankAccount();
		
		//acc1.name="Steve Roger";
		//With Encapsulation: public API method
		acc1.setName("Steve Rogers");
		acc1.setSsn("3453");
		//System.out.println(acc1.getSsn());
		//System.out.println(acc1.getName());
		
		acc1.accountNumber="4211464215";
		acc1.balance=3333;
		//acc1.setRate();
		//acc1.increaseRate();
		acc1.deposit(1547);
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism Through Overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber="4545151653";
	
		BankAccount acc3 = new BankAccount("Saving Account",5555);
		acc3.accountNumber="5615135431";
		
		/*
		acc3.checkBalance();
		
		//Demo for inheritance(Default Constructors were inherited)
		CDaccount cd1 = new CDaccount();
		cd1.accountNumber="5453132135";
		cd1.interestRate=4.5;
		cd1.balance=3000;
		//cd1.name="Hulk";
		cd1.accountType="CD ACCOUNT";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
