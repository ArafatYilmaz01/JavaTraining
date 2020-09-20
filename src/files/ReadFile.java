package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		String filename ="..."; //define path
		File file = new File(filename); // create file
		String text=null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file)); // open the file
			text = br.readLine(); // read the file
			br.close(); // close the resources
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*finally {
			System.out.println("Reading Finished");
		}*/
		System.out.println(text);
		
		
	}

}
