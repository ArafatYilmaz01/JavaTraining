package basics;

public class Cities {
	public static void main(String[] args) {

		//Declare and define array
		String[] Array1 = {"Adana","Ankara","Istanbul"};
		System.out.println(Array1[0]);
		//System.out.println(Array1[1]);
		//System.out.println(Array1[2]);
		
		//Declare and define array(Only Size)
		String[] Array2 = new String[3];
		Array2[0]="Adana";
		Array2[1]="Ankara";
		Array2[2]="Istanbul";
		System.out.println(Array2[1]);
		
	//Declare Array
		String[] Array3;
		
	// Define Array
		Array3 = new String[3];
		Array3[0]="Adana";
		Array3[1]="Ankara";
		Array3[2]="Istanbul";
		System.out.println(Array2[2]);
		
		System.out.println("************************************************");
		int i =0;
		//do: first enter,then test
		do {
			System.out.println(Array3[i]);
			i++;
			
		}while(i<3);
		System.out.println("************************************************");
		
		//while first test,then enter
		int j=0;
		boolean isFound= false;
		while(!isFound) {
			//System.out.println(Array3[j]);
			if(Array3[j]=="Ankara") {
				isFound=true;
				System.out.println("City found,it is:"+Array3[j]);
			}
			j++;
		}
		System.out.println("************************************************");
		
		for(int k=0;k<=2;k++) {
			System.out.println(Array3[k]);
			
		}
	}

}
