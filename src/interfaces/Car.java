package interfaces;

public class Car implements Vehicle {
	
	public void start()
	{
		System.out.println("Car started");
	}
	
	 public void stop()
	{
		System.out.println("Car stopped");
	}
	
	 public static void main(String[] args)
	 {
		 Car obj= new Car();
		 obj.start();
		 obj.stop();
	 }
	 
}
