package oop_matala;

public class Program {

	public static void main(String[] args) {
//		Circuit[] circuits = new Circuit[4];

//		for (int z = 0; z < circuits.length; z++) {
//
//			Car[] cars = new Car[10];
//
//			for (int k = 0; k < cars.length; k++) {
//				Driver[] drivers = new Driver[2];
//
//				for (int i = 0; i < drivers.length; i++) {
//					Medal[] medals = new Medal[4];
//
//					for (int j = 0; j < medals.length; j++) {
//						medals[j] = new Medal((int) (Math.random() * 3 + 1), String.valueOf((int) (Math.random() * 100 + 1960)));
//					}
//					drivers[i] = new Driver("Driver" + (int) (Math.random() * 100), (int) (Math.random() * 100),
//							medals);
//				}
//				cars[k] = new Car("model" + (int) (Math.random() * 100), (int) (Math.random() * 60 + 1960), drivers);
//			}
//
//			circuits[z] = new Circuit("Circuit" + (int) (Math.random() * 100), "country" + (int) (Math.random() * 100),
//					(int) (Math.random() * 30 + 4), cars);
//
//			System.out.println(circuits[z]);
//		}
		
		
		Circuit[] circuits = createCircuits();
		for (int i = 0; i < circuits.length; i++) {
			System.out.println(circuits[i]);
		}
		
		double sumLength = 0;
		for (int i = 0; i < circuits.length; i++) {
			sumLength += circuits[i].getLength();
		}
		System.out.println("Avg of length: " + (sumLength / circuits.length));
		
		double sumAge = 0;
		for (Circuit circuit : circuits) {
			for (Car car : circuit.getCars()) {
				for (Driver driver : car.getDrivers()) {
					sumAge += driver.getAge();
				}
			}
		}
		
		System.out.println("Avg age: " + sumAge / (4*10*2) );

	}
	
	public static Circuit[] createCircuits() {
		Circuit[] circuits = new Circuit[4];
		for (int i = 0; i < circuits.length; i++) {
			circuits[i] = new Circuit("Circuit" + (int) (Math.random() * 100), "country" + (int) (Math.random() * 100),
					(int) (Math.random() * 30 + 4), createCars());
		}
		return circuits;
	}
	
	public static Car[] createCars() {
		Car[] cars = new Car[10];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car("Car" + (int) (Math.random() * 100+1), 2000, createDrivers());
		}
		return cars;
	}

	public static Driver[] createDrivers() {
		Driver[] drivers = new Driver[2];
		for (int i = 0; i < drivers.length; i++) {
			drivers[i] = new Driver("Driver" + (int) (Math.random() * 100+1), 40, createMedals());
		}
		
		return drivers;
	}

	public static Medal[] createMedals() {
		Medal[] medals = new Medal[4];
		for (int i = 0; i < medals.length; i++) {
			medals[i] = new Medal((int) (Math.random() * 3 + 1), "2000");
		}
		
		return medals;
	}
	
}






















