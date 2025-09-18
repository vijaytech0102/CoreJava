package inheritance;

public class SportCar extends Car{
	int topseep;

	
	public SportCar(String fueltype, int seats, int topseep) {
		super(fueltype, seats);
		this.topseep = topseep;
	}

	public int getTopseep() {
		return topseep;
	}

	public void setTopseep(int topseep) {
		this.topseep = topseep;
	}
	void display()
	{
		System.out.println("Fuel:"+fueltype);
		System.out.println("Seat:"+seats);
		System.out.println("Speed:"+topseep);
	}
}