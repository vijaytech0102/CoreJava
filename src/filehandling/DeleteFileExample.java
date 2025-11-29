package filehandling;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("output.txt");
        if (file.delete()) {
            System.out.println("Deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
