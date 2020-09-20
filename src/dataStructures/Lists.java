package dataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Adana");
		cities.add("Ankara");
		cities.add("Bursa");
		cities.add("İstanbul");
		
		for(String city: cities) {
			System.out.println(city);
		}
		int size= cities.size();
			System.out.println(size);
			System.out.println(cities.get(3));
			
			cities.remove(2);
			for(String city: cities) {
				System.out.println(city);
			}
		
			
	}

}
