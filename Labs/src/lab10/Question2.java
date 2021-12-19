package lab10;

public class Question2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 4, 8, 2, 6, 8, 1, 9, 0, 5, 6, 7, 5 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			int c = 0;
			for (int j = 1; j < 10; j++) {
				if(arr1[i] == j) {
					c++;
				}
			}
			if (c > 0) {
				
			}
		}
	}
}
