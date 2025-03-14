package weekFive;

public class Main {


	public static void main(String[] args) {
		Car car = new Car(1000, "petrol", "RAL-9833", "2011", "Honda", "Civic", 23.4, 13.5);
		car.start();
		
		Bus bus = new Bus(76000, "diesel", "GJ-23", 60, 0.30);
		bus.start();
		
		Truck truck = new Truck(105000, "diesel", "MSM-108", 12, 11);
		truck.start();
		
		System.out.println();
		
		Garage garage = new Garage();
		garage.add(car);
		garage.add(bus);
		garage.add(truck);
		garage.garageDetails();
		
	}

}
