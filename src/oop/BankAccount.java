package oop;

public class BankAccount {

	public BankAccount(String CustomerName, int CustomerNO, String CustomerLocation) {
		System.out.println("Name= "+CustomerName);
		System.out.println("CustomerNo= "+CustomerNO);
		System.out.println("Customer Location = "+CustomerLocation);
		
	}
	public BankAccount() {
		deneme++;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String CustomerName) {
		this.CustomerName=CustomerName;
	}
	private String CustomerName;
	int CustomerNO;
	String CustomerLocation;
	static int deneme=123;
	
	
}
