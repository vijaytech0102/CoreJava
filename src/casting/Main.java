package casting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// upcasting--> child object= new Parent()
		Engine object= new Bike();

		//Normal object declaration
		Bike bike2= new Bike();
		
		if (object instanceof Bike) { 
			Bike obj = (Bike) object;  //Down casting 
			obj.kickStart(); // Now we can use BikeEngine methods 
		}
		
		//upcasting -->child object with help parent class
		Animal dog= new Dog();
		
		//Downcasting--> explicit conversion
		Dog dog1= (Dog) dog;
		dog1.sleep();
		dog1.sound();
	}

}
