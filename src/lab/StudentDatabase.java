package lab;

public class StudentDatabase {

	public static void main(String[] args) {
		Student st1 = new Student ("Prototype" , "545316") ;
		st1.enroll("Math4");
		st1.enroll("Chem876");
		st1.enroll("Eng65");
		System.out.println(st1.getEmail());
		
		st1.showCourses();
		st1.checkBalance();
		st1.pay(2391);
		System.out.println(st1.toString());
	}

}


class Student {

	private static int ID = 0;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int cost = 800;
	private int balance = 0;
	
	//Constructors
	public Student (String name, String SSN){
	ID++;
	this.name = name;
	this.SSN = SSN;
	setEmail();
	setUserID();
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max-min)) ;
		random = random + min;
		userID = ID + "" + random + SSN.substring(2);
		System.out.println("YOUR USER ID: " + userID);
	}

	public void setEmail() {
		email = name.toLowerCase() + "." + ID + "@utopiamail.com";
	}
	
	public String getEmail() {
		return "YOUR EMAIL: " + email;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public void enroll(String course) {
		this.courses = this.courses + "  " + course;
		balance = balance + cost;
	}

	public void pay(int amt) {
		System.out.println("PAYMENT: " + amt);
		balance = balance - amt;
		checkBalance();
	}

	public void checkBalance() {
		System.out.println("BALANCE: " + balance);
	}

	public void showCourses() {
		System.out.println("\nCOURSES ARE ::==>>" + courses + "\n");
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + " ]\n[ COURSES:" + courses + " ]\n[ BALANCE: " + balance + " ]";
	}
	
}