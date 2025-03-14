package weekFive;

public class Truck extends Vehicle {
	private int clearance;
	private int maxLoad;

	public int getClearance() {
		return clearance;
	}

	public void setClearance(int clearance) {
		this.clearance = clearance;
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	
	public Truck(int price, String fuel, String licensePlate, int clearance, int maxLoad) {
		super(price, fuel, licensePlate);
		this.clearance = clearance;
		this.maxLoad = maxLoad;
	}

	@Override
	public void displayInfo() {
		System.out.println("This truck has clearance of "+clearance +" ft and has capacity to carry upto "+ maxLoad + " tons");

	}

}
