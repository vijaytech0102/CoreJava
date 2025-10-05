package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1= new Student("Karan",23,45, 450); //
//		obj1.display();
		Student obj3= new Student(obj1);
		obj3.display();
		obj3.checkAge();
		System.out.print(obj3);
	}

}
