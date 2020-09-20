package exception_Demo;

public class exceptionDemo {

	public static void main(String[] args) throws Exception {
		
	try
	{
		mathOp(5,0);
	}
catch(Exception e )
{
	throw new Error("Error Demo");
	//System.out.println(e.getMessage());
	
}
	System.out.println("After Error");
	}

	public static double mathOp(int a, int b) {
		return a/b;
		
	}
}
