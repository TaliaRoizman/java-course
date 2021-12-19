package lab10;

public class Question1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9 };
		int c3 = 0, c1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 3) {
				c3++;
			} else if (arr[i] == 1){
				c1++;	
			}
		}
		System.out.println("The value '3' appears " + c3 + " times in the array");
		System.out.println("The value '1' appears " + c1 + " times in the array");
	}
}
