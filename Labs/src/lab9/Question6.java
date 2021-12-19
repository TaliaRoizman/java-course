package lab9;

public class Question6 {

	public static void main(String[] args) {
		int[] arr = new int[50];
		int high = 0, low = 100, indexHigh = 0, indexLow = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
			if (arr[i] > high) {
				high = arr[i];
				indexHigh = i;
			} else if (arr[i] < low){
				low = arr[i];
				indexLow = i;
			}
		}
		System.out.println("highest value: " + high + " ,index: " + indexHigh);
		System.out.println("lowest value: " + low + " ,index: " + indexLow);
	}
}
