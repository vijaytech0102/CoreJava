package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example1.txt",true)); // append = true
//            bw.newLine();
            String arr[]= {"Hello world", "Welcome","to","java","Programming"};
            for(String word:arr)
            {
            	bw.write(word);
            }
            bw.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
