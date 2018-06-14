package basics;

public class MinMaxAverage {

	// I don't know sum method!!!
	public static void main(String[] args) {
		//The Array
		int[] num = {3,7,9,2};
		System.out.println(aV(num));
		System.out.println(min(num));
		System.out.println(max(num));
	}
	//Average method
	public static int aV(int[] num) {
	    int sum = 0;
	    for (int i = 0; i < num.length; i++) {
	        sum = sum + num[i];
	    }
	    return sum / num.length;
	}
	//Minimum method
	public static double min(int num[]) {
		double min = num[0];
		for(int i = 1;i < num.length; i++) {
			if (num[i]<min) {
				min = num[i];
			}
		}
		return (min);
	}
	//Maximum method
	public static double max(int num[]) {
		double max = num[0];
		for(int i = 1;i < num.length; i++) {
			if (num[i]>max) {
				max = num[i];
			}
		}
		return (max);
	}
	
}
