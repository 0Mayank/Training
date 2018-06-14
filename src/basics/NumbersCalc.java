package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("The Program is Starting");
		printName();
		double numA = 14.93;
		double numB = 23.47;
		addNumbers(numA,numB);
		double product = multiplyNumbers(numA,numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
		
	}
	
	static void printName() {
		System.out.println("My name is Mayank");
	}
	
	static void addNumbers(double A, double B) {
		double sum = A + B;
		System.out.println("The sum of number " + A + " and" + B + " is " + sum);
	}
	
	static double multiplyNumbers(double vA,double vB) {
		double product = vA * vB;
		addNumbers(product,product);
		return product;
	}
	
}
