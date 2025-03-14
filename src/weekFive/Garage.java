package weekFive;

import java.util.LinkedList;

public class Garage {
	private LinkedList<Vehicle> cars;
	private LinkedList<Vehicle> buses;
	private LinkedList<Vehicle> trucks;
	private LinkedList<Vehicle> allVehicles;

	public Garage() {
		cars = new LinkedList<Vehicle>();
		buses = new LinkedList<Vehicle>();
		trucks = new LinkedList<Vehicle>();
		allVehicles = new LinkedList<Vehicle>();
	}
	
	public void add(Bus b) {
		buses.add(b);
	}
	
	public void add(Car c) {
		cars.add(c);
	}
	
	public void add(Truck t) {
		trucks.add(t);
	}
	
	public void garageDetails() {
		cars.addAll(buses);
		cars.addAll(trucks);
		allVehicles.addAll(cars);
		for(int i=0; i<allVehicles.size(); i++) {
			System.out.println(allVehicles.get(i).getLicensePlate());
		}
	}

}
