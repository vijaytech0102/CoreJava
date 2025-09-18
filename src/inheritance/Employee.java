package inheritance;

public class Employee extends Person {
	 protected float salary;

	
	public Employee(String name, float salary) {
		super(name);
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
