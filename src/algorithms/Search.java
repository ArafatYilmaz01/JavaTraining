package algorithms;

public class Search {


public static int LinearSearch(int[] list ,int target) {

	for(int i = 0; i<list.length;i++) {
		if(list[i]==target) {
			return i;
		}
	}
	return -1;
	
}


public static int BinarySearch(int[] list,int start,int end,int target) {

	if(end<=start) 
		return -1;
	int middle = (int)Math.floor((end+start)/ 2);
	 if(list[middle]>target) 
		return BinarySearch(list,start,middle-1,target);
	else if(list[middle]<target) 
		return BinarySearch(list,middle+1,end,target);
	else
	return middle;
	
	
	
}

}