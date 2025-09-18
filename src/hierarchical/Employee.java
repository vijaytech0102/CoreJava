package hierarchical;

//Parent Class
class Employee {
	private int id;
	private String name;
	private double salary;

	// Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
}

//Child Class 1
class Developer extends Employee {
	private String programmingLanguage;

	public Developer(int id, String name, double salary, String programmingLanguage) {
		super(id, name, salary); // Call parent constructor
		this.programmingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public String toString() {
		return super.toString() + ", Developer [Programming Language=" + programmingLanguage + "]";
	}
}

//Child Class 2
class Manager extends Employee {
	private int teamSize;

	public Manager(int id, String name, double salary, int teamSize) {
		super(id, name, salary); // Call parent constructor
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return super.toString() + ", Manager [Team Size=" + teamSize + "]";
	}
}


