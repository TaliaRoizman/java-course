package a;

public class Types {

	public static void main(String[] args) {
		int sum;
		
		// integers 
		byte n1 = 5;
		short n2 = 10;
		int n3 = 15;
		long n4 = 99999999999L; //change default literal type to long
		
		// decimals
		
		float f1 = 5.3F; // change default literal type to float
		double f2 = 5D; // change default literal type to double
		// the expression calculated value has type
		// the type is determined by the members.
		sum  = n1 + n3;
		
		// byte
		// short
		// int
		// long
		// float
		// double
		
		Point p = new Point(5,1);
		System.out.println(p.getX());
		System.out.println(p.getY());
	}
}
