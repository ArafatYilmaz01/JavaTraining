package basics;

public class NumbersCalc {

	public static void main(String[] args) {
	int numA=3,numB=5;
		PrintName();
		AddNumbers(numA,numB);
		int product = MultiplyNumbers(numA,numB);
		System.out.println("Result of multiplying is "+product);
		//System.out.println("Result of multiplying is "+MultiplyNumbers(numA,numB));
		
	}
	static void PrintName() {
		System.out.println("My name is ...");
	}
	
	static void AddNumbers(int numA ,int numB) {
		int sum =numA+numB;
		System.out.println("The sum of "+ numA +" and "+numB+" is "+sum);
		
	}
	static int MultiplyNumbers(int numA,int numB) {
		int product = numA*numB;
		return product;
	}
}
