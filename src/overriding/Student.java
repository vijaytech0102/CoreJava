package overriding;

//Method overriding -->> Polymorphism->> Runtime Polymorpshim--> It is implemented by using Inheritance--> Parent Child relationship--> IS-A relationship
public class Student extends Person {
	int rollnumber;
	float marks;
	
	
	
	public Student() {
	}

	public Student(String name, int age, int rollnumber, float marks) {
		super(name, age);
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	// copy constructor
	public Student(Student s)
	{
		super(s.name, s.age);
		this.rollnumber=s.rollnumber;
		this.marks=s.marks;
	}
	// redefine// override
	void display()
	{
		super.display();
		System.out.println("Roll number:"+rollnumber);
		System.out.println("Marks:"+marks);
	}
	
	void checkAge()
	{
		super.checkAge();
		if(age>=21 && age<=60)
		{
			System.out.println("Employed");
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", Name [Name=" + name+ "]";
	}
}
