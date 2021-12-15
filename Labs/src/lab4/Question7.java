package lab4;

public class Question7 {

	public static void main(String[] args) {
		int factorial = 1;
		int num = (int)(Math.random()*6)+1;
		System.out.println("num: " +num);
		for(int i=2; i<=num; i++) {
			factorial *= i;
		}
		System.out.println("Factorial: " + factorial);
	}

}
