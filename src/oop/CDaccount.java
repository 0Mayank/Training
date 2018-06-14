package oop;

public class CDaccount extends BankAccount implements IRate{
	
	double interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}

}
