package filehandling;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class PrintWriterExample{
    public static void main(String[] args) {
        try {
			/*
			 * PrintWriter pw = new PrintWriter("output.txt");
			 * pw.println("Name: Vijay Sen Singh Yadav");
			 * pw.println("Course: Java Full Stack Development"); pw.printf("Score: %d%%",
			 * 95); pw.close();
			 * System.out.println("Successfully written using PrintWriter.");
			 */
            PrintWriter pw = new PrintWriter("students.txt");
            pw.println("Vijay 95 455.6 maths");
            pw.println("Rohan 89 566.4 maths");
            pw.println("Meera 92 456.34 maths");
            pw.close();

            Scanner sc = new Scanner(new File("students.txt"));
            while (sc.hasNext()) {
                String name = sc.next();
                int marks = sc.nextInt();
                double totalmarks= sc.nextDouble();
                String subject=sc.next();
                System.out.println(name + " scored " + marks+" Total Marks:"+totalmarks+"Subject:"+subject);
            }
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
