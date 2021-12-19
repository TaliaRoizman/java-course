package lab8;

public class Question7 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int min = 100, index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
			if (arr[i] <= min) {
				min = arr[i];
				index = i;
			}
		}
		System.out.println("MIN: " + min + ", index: " + index);
	}
}
