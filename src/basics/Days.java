package basics;

public class Days {
public static void main(String[] args) {

	String dayOfWeek="Tuesday";
	
	switch(dayOfWeek) {
	// if we do not write break; it always writes after it gets true condition
	case "Sunday":
		System.out.println("The day is Sunday");
		break;
	case "Tuesday":
		System.out.println("The day is Tuesday");
		break;
	case "Wednesday":
		System.out.println("The day is Sunday");
		break;
	case "Thursday":
		System.out.println("The day is Thursday");
		break;
	case "Friday":
		System.out.println("The day is Friday");
		break;
	}
}
}
