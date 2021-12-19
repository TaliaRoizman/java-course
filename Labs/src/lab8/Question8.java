package lab8;

public class Question8 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int min = 100, max = 0, indexMin = 0, indexMax = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.print(arr[i] + " ");
			System.out.println();
			sum += arr[i];
			if (arr[i] <= min) {
				min = arr[i];
				indexMin = i;
			} else if (arr[i] >= max) {
				max = arr[i];
				indexMax = i;
			}
		}
		System.out.println("total sum: " + sum);
		System.out.println("avreage: " + (sum / arr.length));
		System.out.println("MIN: " + min + ", index: " + indexMin);
		System.out.println("MAX: " + max + ", index: " + indexMax);
	}
}
