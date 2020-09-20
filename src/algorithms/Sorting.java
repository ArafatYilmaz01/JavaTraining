package algorithms;

public class Sorting {
	
	public static void BubbleSort(int[] list) {
		
		boolean swapped;
		System.out.println("Before sorting: ");
		printArray(list);
		System.out.println("\n");
		do {
			swapped=false;
			for(int i =0;i<list.length-1;i++) {
			if(list[i]>list[i+1]) {
				int temp= list[i];
				list[i]=list[i+1];
				list[i+1]=temp;
				swapped=true;
				
				
			}
		}
	}
		while(swapped);
		System.out.println("After sorting: ");
			printArray(list);
		
	}
	
	private static void printArray(int[] list) {
		
		for(int i : list) {
			System.out.print(i+" ");
		}
	}
}
