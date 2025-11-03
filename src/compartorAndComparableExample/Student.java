package compartorAndComparableExample;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	// data member
	String name;
	int roll;
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+roll);
	}
	
	public void calulate()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student("Ajay",101);
		Student s2= new Student("Karan", 102);
		Student s3= new Student("Sataym",103);
		Student s4= new Student("Aditya",104);
		Student s5= new Student("Gaurav",105);
		// list of list---[[1,2,3],
		//					[4,5,6],
		//					[7,8,9]]
		// list of object
		// list of list-> list[[[1,2,3],[4,5,6],[7,8,9],[[1,2,3],[4,5,6],[7,8,9]],[[1,2,3],[4,5,6],[7,8,9]]]]
								
		//--> primitive data types, list, list of objects
		
		//
		List<Student> studentlist= new ArrayList<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		
		System.out.println(studentlist);
		
		
	}

}
