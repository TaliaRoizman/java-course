package lab10;

import java.util.Arrays;
import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		int c = 0, size = 0;
		boolean isZero = false;
		int[] arr = { 1, 3, 0, 5, 7, 7, 3, 5, 6, 0, 2 };
		int[] copy = new int[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			c = arr[i];
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j] == c) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < copy.length; i++) {
			if (arr[i] != 0) {
				size++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				isZero = true;
			}
		}
		if (isZero == true) {
			size++;
		}
		int[] newArr = new int[size];
		int i=0;
		for (int j = 0; j < arr.length; j++) {
			while(arr[j]!=0 && i<=5) {
				newArr[i] = arr[j];
				break;
			}
			i++;
		}		
		System.out.println(Arrays.toString(newArr));
	}
}
