package oop;

class Person{
	
	String name;
	String Surname;
	int SSN;
	
	void Walk() {
		System.out.println("the User "+name+" is walking");
	}
}

public class demo {
	public static void main(String[] args) {
		
		Person User = new Person();
		
				User.name="aa";
				User.Surname="yy";
				User.SSN=123456789;
				User.Walk();
	}

}
