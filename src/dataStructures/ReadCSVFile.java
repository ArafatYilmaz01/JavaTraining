package dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> data = new ArrayList<String[]>();
		String file ="....";
		String tempReader;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				while((tempReader=br.readLine()) != null) {
					String[] splited=tempReader.split(",");
					data.add(splited);
					
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String[] names: data) {
			System.out.print("[");
			for(String name:names) {
				System.out.print(name + " ");
			}
			System.out.println("]");
			
		}
		
	}

}
