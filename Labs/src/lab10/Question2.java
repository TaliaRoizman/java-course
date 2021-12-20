package lab10;

public class Question2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 4, 8, 2, 6, 8, 1, 9, 0, 5, 6, 7, 5 };
		int places = 0, max = 0;
		while (places <= 9) {
			for (int i = 0; i < arr1.length; i++) {
				int c = 0;
				for (int j = 0; j < 10; j++) {
					if (arr1[i] == j) {
						c++;
					}
				}
				if (c > 0) {
					places++;
				}
			}
		}
		int[] arr2 = new int[places];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[j] == i)
			}
		}
	}
}
