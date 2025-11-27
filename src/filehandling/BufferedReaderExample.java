package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
			String line;
			int countLine=0;
			int countword=0;
			int charcount=0;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				charcount+=line.length();
				String arr[]= line.split(" ");
				countword+=arr.length;
				countLine++;
			}
			System.out.println("Number of lines in the file:"+countLine);
			System.out.println("Number of word present in the File:"+countword);
			System.out.println("Number of character present in the file:"+charcount);
			br.close();
		} catch (IOException e) {
			System.out.println("Error reading file.");
			e.printStackTrace();
			e.getStackTrace();
		}
	}

}


