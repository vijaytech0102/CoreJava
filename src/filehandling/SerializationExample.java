package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
    	
        Student s1 = new Student("Vijay", 95);

        // Serialization
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Vijay Yadav\\Downloads\\student.ser"))) {
            obj.writeObject(s1);
            System.out.println("Object serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Vijay Yadav\\\\Downloads\\\\student.ser"))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Object deserialized: " + s2.name + " - " + s2.marks);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}