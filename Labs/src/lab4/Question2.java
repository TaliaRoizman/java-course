package lab4;

public class Question2 {

	public static void main(String[] args) {
		int j = 0;
		int v = 10;
		// Incremental loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello world!");
		}
		System.out.println("=========");
		// Decremental loop
		for (int i = 10; i >= 1; i--) {
			System.out.println("Hello world!");
		}
		System.out.println("=========");
		// Incremental loop
		while (j < 10) {
			System.out.println("Hello world!");
			j++;
		}
		// Decremental loop
		System.out.println("=========");
		while (v > 1) {
			System.out.println("Hello world!");
			v--;
		}
		System.out.println("=========");

	}

}
