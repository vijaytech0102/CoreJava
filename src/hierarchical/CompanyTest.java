package hierarchical;

//Test Class
public class CompanyTest {
	public static void main(String[] args) {
		Developer dev = new Developer(101, "Alice", 85000, "Java");
		Manager mgr = new Manager(102, "Bob", 120000, 10);
		System.out.println(dev); // Uses overridden toString()
		System.out.println(mgr); // Uses overridden toString()
	}
}