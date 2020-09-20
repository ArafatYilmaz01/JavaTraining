package oop;

public class Student {

	public static void main(String[] args) {
		StudentApp s1 = new StudentApp("aa","1234567");
		s1.enroll("Mat");
		
		System.out.println(s1.toString());
		
		

	}
}
	
	  class StudentApp {
		private int phone;
		private String city;
		private String state;
		private static int ID=1;
		private String UserID;
		private String Name;
		private String SSN;
		private String email;
		private String course="";
		private int balance=0;
		private static final int cost=800;
		 StudentApp(String Name,String SSN) {
			 this.Name=Name;
			 this.SSN=SSN;
			 ID++;
			 setMail();
			 setUserID();
	}

		private void setMail() {
			
			email=Name+"@gmail.com";
			System.out.println(email);
					
		}

		

		
		public void enroll(String course) {
			this.course=this.course+"\n"+course;
			balance+=cost;
			
		}
		public String getCourse() {
			return course;
		}
		public void pay(int amount) {
			balance-=amount;
			
		}
		public void checkBalance() {
			System.out.println("Balance:"+balance);
			
		}
		public String toString() {
			return "name "+Name+" Course:"+ course+" Balance:"+balance;
		}
		public void showCourses() {
			System.out.println("Courses:"+course);
		}
		private void setUserID() {
			int random = (int)(Math.random()*8000)+1000;
			UserID= ID +""+ random+ ""+ SSN.substring(3);
			System.out.println(UserID);
			
		}
		
		public void setPhone(int phone) {
			this.phone = phone;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String	state) {
			this.state = state;
	 }
	  }
	 

