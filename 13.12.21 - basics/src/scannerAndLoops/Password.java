package b;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = 3;
		int password = 123;
		System.out.println("Enter password: ");
		int input = sc.nextInt();

		while (c > 1 && input != password) {
			c--;
			System.out.println(c + " tries left");
			System.out.println("worng password, try again: ");
			input = sc.nextInt();
		}
		sc.close();
		if (input == password) {
			System.out.println("you've logged in successfully!");
		} else {
			System.out.println("login failed");
		}
	}

}
