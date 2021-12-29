package app.core;

public abstract class Car {

	int number;
	int speed;

	public Car() {
	}

	public Car(int number, int speed) {
		this.number = number;
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= 110 && speed >= 0) {
			this.speed = speed;
		} else {
			System.out.println("You're exceeding the speed limit.");
		}
	}
	
	
}
