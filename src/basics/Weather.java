package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the weather (temperature and sunCondition)
		
		System.out.println("The Program is Starting");
		System.out.println("");
		
		int temperature = 40;
		String sunCondition = "overcast";
		
		if (temperature > 45) {
			System.out.println("It's a hot day. Wear shorts and T-shirts");
		}
		
		else if ((temperature > 34) && (sunCondition == "Sunny")) {
			System.out.println("It's a littl cooler. Wear a long sleeves shirt and jeans");
			System.out.println("Wear a hat to block the sunlight");
		}
		
		else if ((temperature > 27) || (sunCondition == "overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes");
		}
		
		else {
			System.out.println("Looks like a cold day. Wear a sweater");
		}
		
		System.out.println("");
		System.out.println("The Program is Ending");
	}
}
