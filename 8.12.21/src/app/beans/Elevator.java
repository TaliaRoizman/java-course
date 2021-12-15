package app.beans;

public class Elevator {
	private int numberOfFloors;
	private int currentFloor;
	private int capcity;
	
	public Elevator() {
	}
	public Elevator(int numberOfFloors, int currentFloor, int capcity) {
		this.numberOfFloors = numberOfFloors;
		this.currentFloor = currentFloor;
		this.capcity = capcity;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getCapcity() {
		return capcity;
	}
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	
}
