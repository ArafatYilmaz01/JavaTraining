
package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		String filename ="..."; //define path
		File file = new File(filename); // create file
		 String[] text=new String[13];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file)); // open the file
			
			for(int i =0; i<text.length;i++) {
				text[i] = br.readLine(); // read the file
				System.out.println(text[i]);
			}
			br.close(); // close the resources
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*finally {
			System.out.println("Reading Finished");
		}*/
		try {
			if(text.length !=10)
				throw  new PhoneNumberException2(text);
			System.out.println(text[0]);
		}
		catch(PhoneNumberException2 e) {
			System.out.println(e.toString());
		}
		
		
		
	}	

	}
	class PhoneNumberException2 extends Exception{
		String[] num;
		PhoneNumberException2(String[] num){
			this.num=num;
		}
		public String toString() {
			return ("Phone Number Exception "+num);
		}
	}

