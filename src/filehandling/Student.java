package filehandling;

import java.io.*;

class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String name;
    int marks;
    String address;
    char gender;
    String contact;
    public Student(String name, int marks, String address, char g, String contact) {
        this.name = name;
        this.marks = marks;
        this.address=address;
        this.gender=g;
        this.contact=contact;
        }
}


