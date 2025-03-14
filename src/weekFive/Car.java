package weekFive;

public class Car extends Vehicle {
	
	private String year;
	private String make;
	private String model;
	private double avg;
	private double tankCap;
	
	

	public Car(int price, String fuel, String licensePlate, String year, String make, String model, double a, double tc) {
		super(price, fuel, licensePlate);
		this.make= make;
		this.year= year;
		this.model = model;
		this.avg = a;
		this.tankCap = tc;
		
	}

	@Override
	public void displayInfo() {
		System.out.println(year + " " + make+ " "+ model + " has tank capacity of "+tankCap+" gallons with an average of "+avg +" miles per gallon");

	}

}
