package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
	
		String fileName = "...";
		String message ="aa";
		
		File file = new File(fileName);
		
		try {
			FileWriter fw= new  FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}

}
