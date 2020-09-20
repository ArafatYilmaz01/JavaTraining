package assignment_1;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println(sum(2));
	}
	public static int sum(int n) {
		int total =0;
		for(int i=1;i<=n;i++) {
			total+=i;
		}
		return total;
	}
}
