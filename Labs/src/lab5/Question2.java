package lab5;

public class Question2 {

	public static void main(String[] args) {
		int rightDigit;
		int num = (int)(Math.random()*10001);
		rightDigit = num%10;
		System.out.println("The right digit of the number "+ num + " is " + rightDigit);
	}

}
