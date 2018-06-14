package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// A variable to define our career
		
		// Declared a variable
		String career;
		System.out.println("Program is Starting");
		
		// Defined a Variable
		career = "Software Develper";
		System.out.println("My Career : " + career);
		
		// Declare & Define
		int hoursPerWeak = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeak * weeksPerYear * rate;
		System.out.println("My sallary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year");
		
		// Compute our annual salary
		// Which is - rate * hoursPerWeak * weeksPerYear
	}
}
