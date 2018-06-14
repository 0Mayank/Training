package oop;

public class AccountAPP {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setTerm(20);
		la.setAmortSchedule();
		
		//Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
	}

}
