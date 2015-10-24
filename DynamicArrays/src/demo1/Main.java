package demo1;

public class Main {

	public static void main(String[] args) {
		Fleet fleet = new Fleet();
		
		Car car1 = new Car("Toyota", "Tacoma", "2008", "white");
		Car car2 = new Car("Toyota", "Rav4", "2010", "black");
		Car car3 = new Car("Honda", "Civic", "2015", "red");
		Car car4 = new Car("Toyota", "Corolla", "2015", "white");
		Car car5 = new Car("Toyota", "Camry", "2016", "blue");
		
		/** not sure what these warnings are about **/
		fleet.add(car1);
		fleet.add(car2);
		fleet.add(car3);
		fleet.add(car4);
		fleet.add(car5);
		
		fleet.printFleet();
	}

}
