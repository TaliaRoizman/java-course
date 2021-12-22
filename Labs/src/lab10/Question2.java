package lab10;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 8, 2, 6, 8, 1, 9, 0, 5, 6, 5 };
		int c = 0;
		boolean isVal = false;
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == j) {
					isVal = true;
					break;
				}
			}
			if (isVal == true) {
				c++;
			}
		}
		System.out.println(c);
		int[] arr2 = new int[c];
		for (int i = 0; i <= c; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == i) {
					arr2[i] = i;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
