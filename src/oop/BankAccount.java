package oop;

public class BankAccount implements IRate{
		
		//Define variables
		String accountNumber;
		
		//static >> belongs to the class and not the object instance
		//final >> constant (often static final are used)
		private static final String routingNumber = "6738492398";
		
		//Instance variable
		private String name;
		private String ssn;
		String accountType;
		double balance = 0;
		
		//Constructors::==>> Unique Methods
			// 1. They are used to define/setup/initialize properties of an object
			// 2. They are IMPLICITLY called upon instantiation
			// 3. The same name as the class itself
			// 4. They have no RETURN type
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED");
		}
		
		// Overloading: call same method name with different arguments
		BankAccount(String accountType){
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		
		BankAccount(String accountType, double initdeposit){
			//These are local variables
			System.out.println("NEW ACCOUNT: " + accountType);
			
			String msg = null;
			if(initdeposit < 1000) {
				System.out.println("INITIAL DEPOSIT OF: $" + initdeposit);
				msg = "ERROR: THE MINIMUM DEPOSIT SHOULD BE ATLEAST $1,000 DOLLARS";
			}else {
				msg = "THANKS FOR YOUR INITIAL DEPOSIT OF: $" + initdeposit;
			}
			balance=balance+initdeposit;
			System.out.println(msg);
		}
		
		
		//Define methods
		void deposit(double amt) {
			balance = balance + amt;
			showActivity("DEPOSIT");
		}
		
		void withdraw(double amt) {
			balance = balance - amt;
			showActivity("WITHDRAW");
		}
		
		//Private
		private void showActivity(String activity) {
			System.out.println("Your recent activity: " + activity );
			System.out.println("Your new balance: " + balance);
		}
		
		void checkBalance() {
			System.out.println("Balance: $" + balance);
		}
		
		void getStatus() {
			
		}
		
		//Interfaces
		public void setRate() {
			System.out.println("Setting Rate");
		}
		
		public void increaseRate() {
			System.out.println("Incresing Rate");
		}
		
		
		// Getters / Setters
		
		//Allow the user to define the name
		public void setName(String name) {
			this.name = "Mr. " + name;
		}
		public String getName() {
			return name;
		}
		
		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = "SSN: " + ssn;
		}

		@Override
		public String toString() {
			return "[ NAME: " + name + ", ACCOUNT NO." + accountNumber + "ROUTING NO. #" + routingNumber + ", BALANCE: $" + balance + " ]"; 
		}
		
}
