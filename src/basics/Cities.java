package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and Define an Array
		String[] cities = {"Delhi", "Mumbai","Kolkata","Srinagar"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare array
		String[] countries;
		
		//Define array
		countries = new String [3];
			countries[0] = "India";
			countries[1] = "Russia";				
			countries[2] = "USA";
		System.out.println(countries[0]);
		
		
		System.out.println("uvgjkskhfjldahfieufoieu38r78eur0u3802hufehbq");
		
		
		// Declare the array(only size)
		String[] states = new String[5];
			states[0] = "Jammu";
			states[1] = "Uttarakhand";
			states[2] = "Himachal Pradesh";
			states[3] = "Uttar Pradesh";
			states[4] = "Rajasthan";
		int i = 0;
		
		//DO loop: enters the loop and then tests condition
		do {
			System.out.println("STATE : " + states[i]);
			i=i + 1;
		}while (i < 5);
		
		//While loop: Tests Condition and then Enters The Loop
		int x =0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[x];
			System.out.println(state);
			if (state == "Jammu") {
				System.out.println("STATE Found!");
				stateFound = true;
			}
			x++;
		}
		System.out.println("\nPINTING WITH FOR LOOP ::==>>\n");
		// For loop: Best structure for array
		for (int y = 0; y < 5; y++) {
			System.out.println(states[y]);
		}
	}

}