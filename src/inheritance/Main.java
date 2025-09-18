package inheritance;

public class Main {

	public static void main(String[] args)
	{
		
		Person p1= new Person("Rahul");
		Manager m1= new Manager();
		m1.display();
		Manager m2= new Manager("Ajay", 450808,"CSE");
		m2.display();
		m2.setName("Karan");
		m2.setSalary(4500);
		m2.setDepartment("It department");
		m2.display();
		float sal=m2.getSalary();
		System.out.println("Existing salary:"+sal);
		if(sal<=4500)
		{
			m2.setSalary(sal*2);
		}
		m2.display();
		m2.setDepartment("cyber");
		m2.display();
		Manager m3= new Manager(m2);
		m3.display();
		
		SportCar s1= new SportCar("Petrol",4,450);
		s1.display();
	}

}
