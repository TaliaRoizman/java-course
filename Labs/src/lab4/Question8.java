package lab4;

public class Question8 {

	public static void main(String[] args) {
		int factorial = 1;
		int num = (int)(Math.random()*7)+1;
		System.out.println("num: " + num);
		// for incremental loop
		for (int i = 2; i <= num; i++) {
			factorial *= i;
		}
		System.out.println("Factorial incremental: " + factorial);
		factorial = 1;

		// for Decremental loop
		for (int i = num; i >= 2; i--) {
			factorial *= i;
		}
		System.out.println("Factorial Decremental: " + factorial);
		factorial = 1;

		// while incremental loop
		int i = 1;
		while (i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial incremental: " + factorial);
		factorial = 1;

		// while Decremental loop
		while (num > 1) {
			factorial *= num;
			num--;
		}
		System.out.println("Factorial Decremental: " + factorial);

	}

}
