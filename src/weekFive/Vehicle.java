package weekFive;

public abstract class Vehicle {
	private int price;
	private String fuel;
	private String licensePlate;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String lp) {
		this.licensePlate = lp;
	}

	

	public Vehicle(int price, String fuel, String lp) {
		this.price=price;
		this.fuel = fuel;
		this.licensePlate = lp;
	}
	
	public void start() {
		System.out.println("Vehicle started.");
		this.displayInfo();
	}
	
	public void stop() {
		System.out.println("Vehicle stopped");
	}
	
	public abstract void displayInfo();

}
