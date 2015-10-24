package demo1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Car> fleet = new ArrayList<Car>();
		Car car1 = new Car("Toyota", "Tacoma", "2008", "white");
		
		fleet.add(car1);
		
		System.out.println("Current size of fleet: " + fleet.size());
		
		fleet.get(0).printCar();
	}

}
