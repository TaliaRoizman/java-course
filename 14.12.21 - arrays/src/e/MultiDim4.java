package e;

public class MultiDim4 {
	
	public static void main(String[] args) {
		double result = add(5.5, 20);
		System.out.println(result);
		
		result = sub(30, 23.9);
		System.out.println(result);
	}

	public static double add(double a, double b) {
		return a + b;
	}
	public static double sub(double a, double b) {
		return a - b;
	}
}
