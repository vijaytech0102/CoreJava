package filehandling;

import java.io.*;

class Student implements Serializable {
	
//	private static final long serialVersionUID = 1L;
	String name;
    int marks;
    String address;
    public Student(String name, int marks, String address) {
        this.name = name;
        this.marks = marks;
        this.address=address;
        
        }
}


