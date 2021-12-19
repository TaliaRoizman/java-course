package lab8;

public class Question3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
		}
		System.out.print("sum = " + sum);
	}
}
