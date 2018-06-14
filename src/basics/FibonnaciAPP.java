package basics;

public class FibonnaciAPP {

	public static void main(String[] args) {
		//Fibonnci number is defined as the sum of two previous fibonnaci number
		/* 
		 * fib(0)=0
		 * fib(1)=1
		 * fib(2)=fib(1) + fib(0)=1
		 * fib(3)=fib(1)+fib(2)=2
		   */
		System.out.println(fib(6));
	}
	// This Process id called recursion
	public static int fib(int n) {
		if (n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
}
