package compartorAndComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	
	// data member
	String name;
	int roll;
	int age;
	Float marks;
	
	
	// constructor
	public Student(String name, int roll, int age, float marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.marks = marks;
	}

	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+roll);
	}
	
	public void calulate()
	{
		
	}
	
	@Override
	public int compareTo(Student s1)
	{
		// descending order --> other-this
		// ascending order --> this-other
		return s1.age-this.age;
	}
	
	 @Override
	 public String toString()
	 {
		 return name; 
//		 return "Name"+":"+this.name+" Roll number:"+this.roll+" Marks:"+this.marks+ " Age:"+this.age+"";
	 }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Student s1= new Student("Aj",101, 23, 566f);
		Student s2= new Student("Kar", 102,13,454.09f);
		Student s3= new Student("Sataym",104,34,564.34f);
		Student s4= new Student("A",104,23, 454.56f);
		Student s5= new Student("Gauravbbb",105,21,5634.09f);
		// list of list---[[1,2,3],
		//					[4,5,6],
		//					[7,8,9]]
		// list of object
		// list of list-> list[[[1,2,3],[4,5,6],[7,8,9],[[1,2,3],[4,5,6],[7,8,9]],[[1,2,3],[4,5,6],[7,8,9]]]]
								
		//--> primitive data types, list, list of objects
		
		//
		List<Student> studentlist= new ArrayList<>();
		studentlist.add(s5);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s1);
		studentlist.add(s4);
		
		System.out.println(studentlist.get(0).marks);
		
//		// before sorting
//		System.out.println(studentlist);
//		
//		// sort by age using comparable
//		Collections.sort(studentlist);
//		
//		// after sorting
//		System.out.println(studentlist);
		
		// sort by name using comparator
		Collections.sort(studentlist, new NameComparator());
		System.out.println(studentlist);
		
		// sort by marks
		Collections.sort(studentlist, new MarksComparator());
		System.out.println(studentlist);
	}

}
