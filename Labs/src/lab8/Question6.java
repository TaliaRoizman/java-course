package lab8;

public class Question6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 0, index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
			if (arr[i] >= max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("MAX: " + max + ", index: " + index);
	}
}
