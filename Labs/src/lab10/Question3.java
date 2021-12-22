package lab10;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		System.out.println("The array before reversing: " + Arrays.toString(arr1));
		int[] arr2 = new int[arr1.length];
		int len = arr1.length;
		for(int i = 0; i < arr2.length; i++) {
				arr2[i] = arr1[len-1];
				len--;
			}

		System.out.println("The array after reversing: " + Arrays.toString(arr2));
		
	}
}
