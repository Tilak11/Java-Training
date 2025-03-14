package weekFive;

public class Bus extends Vehicle {
	
	private int passangerCapacity;
	private double charge;

	public int getPassangerCapacity() {
		return passangerCapacity;
	}

	public void setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}


	public Bus(int price, String fuel, String licensePlate, int cap, double charge) {
		super(price, fuel, licensePlate);
		this.passangerCapacity = cap;
		this.charge = charge;
	}

	@Override
	public void displayInfo() {
		System.out.println("This bus can accomodate upto "+ passangerCapacity+" people and charges $" + charge +" per mile");

	}

}
