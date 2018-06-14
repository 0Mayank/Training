package oop;


class person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		person person1 = new person();
		
		//Define properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "7853164952";
		
		//Abstraction
		person1.walk();
		
		person person2 = new person();
		person2.name="Sarah";
		person2.sleep();
	}
	
}

/*
//Eg;
//Person-

//ATTRIBUTES, VARIABLES, ADJECTIVES
String name = "Joe";
String email = name + "@testmail.com";
String phone = "7853164952";

//ACTION, ACTIVITY BEHAVIOUR
//System.out.println(name + " is walking");

walking(name);
System.out.println(name + " is eating");

//What if  wanted to do this for another person
//ATTRIBUTES, VARIABLES, ADJECTIVES
String name2 = "Sarah";
String email2 = name2 + "@testmail.com";
String phone2 = "9562146352";

//ACTION, ACTIVITY BEHAVIOUR
//System.out.println(name2 + " is walking");

walking(name2);
System.out.println(name2 + " is eating");

//what about binding attributes and properties together?
}

//Lets enhance the code by adding functions
static void walking(String name) {
System.out.println(name + " is walking");
*/