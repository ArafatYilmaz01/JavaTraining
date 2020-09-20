package algorithms;

public class Demo {

	public static void main(String[] args) {
	int[] elementsForLinearSearch= {1,2,5,4,10,22,7,6,9,0};
	//System.out.println(Search.LinearSearch(elementsForLinearSearch, 6));
	int[] elementsForBinarySearch= {0,5,10,15,20,25,30,35,40,45,50}; // BinarySearch Works on sorted array
	
	int number =Search.BinarySearch(elementsForBinarySearch, 0, elementsForBinarySearch.length-1, 30);
	//if(number==-1)
	//	System.out.println("Your number does not found");
	//else
	//	System.out.println("Your number is : "+elementsForBinarySearch[number]+" and at "+number+"."+" index");
	Sorting.BubbleSort(elementsForLinearSearch);
	}

}
