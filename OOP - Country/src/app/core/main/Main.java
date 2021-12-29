package app.core.main;

import app.core.Car;
import app.core.Country;
import app.core.FamilyCar;
import app.core.Highway;
import app.core.SportsCar;

public class Main {

	public static Highway fillHighways(String name) {
		Car[] cars = new Car[100];
		for (int i = 0; i < cars.length; i++) {
			if (Math.random() < 0.7) {
				if (Math.random() > 0.5) {
					cars[i] = new SportsCar((int) (Math.random() * 10000) + 20000, (int) (Math.random() * 111));
				} else {
					cars[i] = new FamilyCar((int) (Math.random() * 10000) + 20000, (int) (Math.random() * 111));
				}
			}
		}
		Highway h1 = new Highway(name, cars);
		return h1;
	}

	public static void numberOfCars(Country c) {
		int counterCars = 0;
		for (int i = 0; i < c.getHighways().length; i++) {
			for (int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if (c.getHighways()[i].getCars()[j] != null) {
					counterCars++;
				}
			}
		}
		System.out.println("number of cars in the country: " + counterCars);
	}

	public static void numberOfCars(Highway h) {
		int counterCars = 0;
		for (int i = 0; i < h.getCars().length; i++) {
			if (h.getCars()[i] != null) {
				counterCars++;
			}
		}
		System.out.println("number of cars in " + h.getName() + ": " + counterCars);
	}

	public static void avgSpeed(Country c) {
		int sumSpeed = 0, counterCars = 0;
		for (int i = 0; i < c.getHighways().length; i++) {
			for (int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if (c.getHighways()[i].getCars()[j] != null) {
					sumSpeed += c.getHighways()[i].getCars()[j].getSpeed();
					counterCars++;
				}
			}
		}
		System.out.println("Average speed: " + (sumSpeed / counterCars));
	}

	public static void maxSpeed(Country c) {
		int maxSpd = 0;
		for (int i = 0; i < c.getHighways().length; i++) {
			for (int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if ((c.getHighways()[i].getCars()[j] != null)
						&& (c.getHighways()[i].getCars()[j].getSpeed() > maxSpd)) {
					maxSpd = c.getHighways()[i].getCars()[j].getSpeed();
				}
			}
		}
		System.out.println("Max speed: " + maxSpd);
	}

	public static void fullestHighway(Country c) {
		int maxCars = 0, counterCars = 0;
		Highway fullestHighway = new Highway();
		for (int i = 0; i < c.getHighways().length; i++) {
			for (int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if (c.getHighways()[i].getCars()[j] != null) {
					counterCars++;
				}
			}
			if (counterCars > maxCars) {
				maxCars = counterCars;
				fullestHighway = c.getHighways()[i];
			}
			counterCars = 0;
		}
		System.out.println("Fullest highway: " + fullestHighway.getName());
	}

	public static void highwayMaxSpeedAvg(Country c) {
		int maxAvg = 0, sumSpeed = 0, counterCars = 0;
		Highway maxAvgHighway = new Highway();
		for (int i = 0; i < c.getHighways().length; i++) {
			for (int j = 0; j < c.getHighways()[i].getCars().length; j++) {
				if (c.getHighways()[i].getCars()[j] != null) {
					sumSpeed += c.getHighways()[i].getCars()[j].getSpeed();
					counterCars++;
				}
			}
			if ((sumSpeed / counterCars) > maxAvg) {
				maxAvg = sumSpeed / counterCars;
				maxAvgHighway = c.getHighways()[i];
			}
			counterCars = 0;
			sumSpeed = 0;
		}
		System.out.println("The highway with the highest average speed: "+ maxAvgHighway.getName());
	}

	public static void main(String[] args) {

		Highway[] highways = new Highway[5];
		String[] names = { "h1", "h2", "h3", "h4", "h5" };

		for (int i = 0; i < highways.length; i++) {
			highways[i] = fillHighways(names[i]);
		}

		Country brazil = new Country(highways);
		numberOfCars(brazil);
		numberOfCars(highways[0]);
		numberOfCars(highways[1]);
		numberOfCars(highways[2]);
		numberOfCars(highways[3]);
		numberOfCars(highways[4]);
		avgSpeed(brazil);
		maxSpeed(brazil);
		fullestHighway(brazil);
		highwayMaxSpeedAvg(brazil);
	}

}
