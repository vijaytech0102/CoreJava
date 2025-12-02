package filehandling;

import java.io.*;

public class BinaryFileExample {
    public static void main(String[] args) {
        
    	try (FileInputStream fis = new FileInputStream("C:\\Users\\Vijay Yadav\\Downloads\\cartoon.png");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\Vijay Yadav\\Downloads\\p.png")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
            	System.out.println(byteData);
                fos.write(byteData);
            }
            System.out.println("Binary file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
