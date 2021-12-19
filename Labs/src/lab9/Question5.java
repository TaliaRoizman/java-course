package lab9;

public class Question5 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sumEven = 0, sumOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
			if (arr[i] % 2 == 0) {
				sumEven += arr[i];
			} else {
				sumOdd += arr[i];
			}
		}
		System.out.println("sum of all even numbers: " + sumEven);
		System.out.println("sum of all odd numbers: " + sumOdd);

		if (sumEven > sumOdd) {
			System.out.println("The sum of the even numbers is bigger");
		} else {
			System.out.println("The sum of the odd numbers is bigger");
		}
	}
}
