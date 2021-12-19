package a;

import java.util.Scanner;

public class EndTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // input from keyboard
		System.out.println("Enter day: ");
		String day = sc.nextLine();
		sc.close(); // close the scanner
		System.out.println(day);

		switch (day) {
		case "sunday":
		case "monday":
		case "wednesday":
		case "thursday":
			System.out.println("leave at 16:30");
			break;
		case "tuesday":
			System.out.println("leave at 12:30");
			break;
		case "friday":
		case "saturday":
			System.out.println("weekend!!!");
			break;

		default:
			System.out.println(day + " is not a day");
		}
	}
}
