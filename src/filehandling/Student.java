package filehandling;

import java.io.*;

class Student implements Serializable {
    
	String name;
    int marks;
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


