package inheritance;

public class Manager extends Employee {
	 private String department;

	public Manager() {
		super();
	}

	public Manager(String name, float salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public Manager(Manager m)
	{	super(m.name, m.salary);
		this.department=m.department;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(department);
	}
	
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}