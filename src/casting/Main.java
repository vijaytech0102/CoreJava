package casting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object creation--> normal
		Bike objectname= new Bike();
		
		// upcasting--> child object= new Parent()
		Engine object= new Bike();
		object.start();
		Bike obj = (Bike) object;
		obj.start();
		//Normal object declaration
		
		Bike bike2= new Bike();
		
		if (object instanceof Bike) { 
			  //Down casting 
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
