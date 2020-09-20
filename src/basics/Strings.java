package basics;

public class Strings {
	public static void main(String[] args) {
		
		
		String Name="aa";
		String LastName="yy";
		String SSN="0123456789";
		
		String SearchedWord="Ara";
		if(Name.contains(SearchedWord)) {
			System.out.println("Name Contains:"+ SearchedWord);
		}
		if(LastName.equalsIgnoreCase("yy")) {
			System.out.println("We found same LastName");
		}
		System.out.print(Name.substring(0,4)+" - ");
		System.out.println(LastName.substring(0,4));
		System.out.println(SSN.length());
	}

}
