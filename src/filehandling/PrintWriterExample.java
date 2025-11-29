package filehandling;

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample{
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Name: Vijay Sen Singh Yadav");
            pw.println("Course: Java Full Stack Development");
            pw.printf("Score: %d%%", 95);
            pw.close();
            System.out.println("Successfully written using PrintWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
