package demo1;

public class Car {
	private String make;
	private String model;
	private String year;
	private String color;
	
	public Car(String make, String model, String year, String color) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		this.setColor(color);
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printCar() {
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Year: " + this.year);
		System.out.println("Color: " + this.color);
	}
}
