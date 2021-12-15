package lab5;

public class Question1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10001);
		int copy = num;
		int c = 0;
		while (num > 0) {
			c++;
			num = (int)(num/10);
		}
		System.out.println("To the number "+ copy + " has " + c + " digits.");

	}

}
