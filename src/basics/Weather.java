package basics;

public class Weather {

	public static void main(String[] args) {
		int temperature=70;
		String sunCondition="Sunny";
		
		if(temperature>80) {
			System.out.println("It is hot day.Wear a shorts");
		}
		else if(temperature >60 && sunCondition=="Sunny") {
			System.out.println("It is a bit cooler,wear jeans");
			System.out.println("Take hat for your eyes to prevent the sunlight");
		}
		else if(temperature >50 || sunCondition=="OverCast") {
			System.out.println("It is cool day wear warmer clothes");
			
		}
		else {
			System.out.println("It is really cold day,wear sweater");
		}
		System.out.println("Program ending");
	}
}
