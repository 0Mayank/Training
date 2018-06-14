package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "LORD";
		bookTitle = "THE GREAT LORD MAYANK";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The Book Contains the Word " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The Browser is Chrome");
		}
		
		String name1 = "Mayank";
		String name2 = "Tomar";
		String ssn = "8750180131";
		
		System.out.println("\nThere are " + ssn.length() + " digits in your SSN -> " + ssn);
		
		System.out.print("\n				Fake New ID ::==>> ");
		//Print Initials with last 4 digits of SSN
		System.out.print(" " + name1.substring(0, 1));
		System.out.print(name2.substring(0, 1));
		System.out.print(ssn.substring(6));
		
	}

}
