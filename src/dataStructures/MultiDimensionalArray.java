package dataStructures;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		String[][] MDArray = {
				{"aa","bb","Adana"},
				{"aa","bb","Ankara"},
				{"aa","bb","İstanbul"},
				
		};
		for(String[]users: MDArray) {
			System.out.print("[");
			for(String user:users) {
				System.out.print(user+" ");
			}
			System.out.println("]");
		}
		
	}

}
