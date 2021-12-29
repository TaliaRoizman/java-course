package app.core;

public class Highway {
	
	String name;
	Car[] cars = new Car[100];
	
	public Highway() {
	}
	
	public Highway(String name, Car[] cars) {
		this.name = name;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
	
	
}
