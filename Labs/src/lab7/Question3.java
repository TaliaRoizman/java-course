package lab7;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int c = 0;
		String str = "Sara shara shir sameach";
		char[] arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if('a' == arr[i] || 'e' == arr[i] || 'o' == arr[i] || 'i' == arr[i] || 'u' == arr[i]) {
				c++;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Vowles appears " + c + " times.");
		}

	}

}
