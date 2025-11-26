package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("example.txt"));
			String line;
			int count=0;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				count++;
			}
			System.out.println("Number of lines in the file:"+count);
			br.close();
		} catch (IOException e) {
			System.out.println("Error reading file.");
			e.printStackTrace();
		}
	}

}


