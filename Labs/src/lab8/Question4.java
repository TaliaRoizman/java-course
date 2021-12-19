package lab8;

public class Question4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("average = " + (sum/arr.length));
	}
}
