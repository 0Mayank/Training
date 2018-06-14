package lab;

public class BankAccountAPP {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465287456", 1000);
		BankAccount acc2 = new BankAccount("135624985", 2000);
		BankAccount acc3 = new BankAccount("963251487", 2347.93);
	
		acc1.setName("Goku");
	}

}



class BankAccount implements Interest{
	
	//Properties
	private static int ID = 1000;      //Internal ID
	private String accountNumber;     // id + random 2-digit number + first two digits of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	//Account Number
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);		
		System.out.println("Your Account Number : " + accountNumber);		
	}

	/**
	 * return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amt) {
		balance = balance - amt;
		System.out.println("PAYING BILL : " + amt);
		showBalance();
	}
	
	public void makeDeposit(double amt) {
		balance = balance + amt;
		System.out.println("MAKING DEPOSIT : " + amt);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("BALANCE : " + balance);
	}

	@Override
	public void accrue() {
		balance = balance + (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return ("[ Name: " + name + " ]\n[ Account Number: " + accountNumber + " ]\n[ Routing Number: " + routingNumber + " ]\n[ Balance: " + balance + " ]" );
	}
	
}