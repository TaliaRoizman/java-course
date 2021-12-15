package a;

public class CarApp {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.number = 202345;
		c1.color = "red"; 
		c1.type = "n";
		c1.year = 2018;
		System.out.println(c1.number);
		System.out.println(c1.color);
		System.out.println(c1.type);
		System.out.println(c1.year);
		Car c2 = new Car();
		c2.number = 50321;
		c2.color = "blue";
		c2.type = "d";
		c2.year = 2020;
		System.out.println(c2.number);
		System.out.println(c2.color);
		System.out.println(c2.type);
		System.out.println(c2.year);
	}

}
