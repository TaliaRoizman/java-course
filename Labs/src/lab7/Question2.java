package lab7;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		String name = "John Bryce";
		int c = 0;
		char[] arr = new char[name.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = name.charAt(i);
			if('h' == arr[i]) {
				c++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("'h' appears " + c + " times.");
	}
}
