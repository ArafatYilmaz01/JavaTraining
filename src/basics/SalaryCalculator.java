package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		//declare a variable
		String career;
		// define a variable
		career="Software Developer";
		//declare and define a variable
		int hoursPerWeek=40;
		int weekPerYear=50;
		double rate=40.5;
		double salary= rate*hoursPerWeek*weekPerYear;
		
		System.out.println("my salary as a "+ career+" at the rate of "+ rate +" per hour is "+ salary+" per year");
	}
}
