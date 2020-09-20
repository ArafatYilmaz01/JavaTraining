package assignment_1;

public class MinMaxAvg {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8,9,10};
		
		System.out.println(Min(a));
		System.out.println(Max(a));
		System.out.println(Avg(a));

	}
		public static int Min(int[] n) {
			int minNumber = n[0];
			for(int i =1; i<n.length;i++) {
				if(n[i]<minNumber) {
					minNumber=n[i];
				}
			}
			return minNumber;
			
		}
		public static int Max(int[] n) {
			int maxNumber = n[0];
			for(int i =1; i<n.length;i++) {
				if(n[i]>maxNumber) {
					maxNumber=n[i];
				}
			}
			return maxNumber;
			
		}
		public static int Avg(int[] n) {
			int avgNumber=0;
			int total=0;
			for(int i =0;i<n.length;i++) {
				total+=n[i];			
			}
			
			avgNumber=total/n.length;
			return avgNumber;
			
		}
}
