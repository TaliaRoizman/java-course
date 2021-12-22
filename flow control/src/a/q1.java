package a;

import java.util.Arrays;

public class q1 {

	// The highest number that can be composed of
	// the digits in the array and that all its digits are the same
	public static int BiggerNumArr(int[] arr) {
		int maxDigits1 = 0, c1, maxDigitsNum1 = 0;
		for (int j = 1; j <= 9; j++) {
			c1 = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == j) {
					c1++;
				}
			}
			if (c1 > maxDigits1) {
				maxDigits1 = c1;
				maxDigitsNum1 = j;
			}
		}
		int n = 0;
		for (int i = 0; i < maxDigits1; i++) {
			n += maxDigitsNum1 * Math.pow(10, i);
		}
		return n;
	}

	// Create a 5-length array without duplicates
	// of the highest numbers out of two arrays
	public static int[] Top5MaxArr(int[] num1, int[] num2) {
		int[] maxArr1 = new int[5];
		int[] maxArr2 = new int[5];
		int current;
		for (int i = 0; i < num1.length; i++) {
			current = num1[i];
			for (int j = (i + 1); j < num1.length; j++) {
				if (num1[j] == current) {
					num1[j] = 0;
				}
			}
		}
		Arrays.sort(num1);
		int len = 0;
		for (int i = num1.length - 1; i >= 0; i--) {
			if (num1[i] != 0 && len < 5)
				maxArr1[len] = num1[i];
			len++;
		}
		Arrays.sort(num2);
		len = 0;
		for (int i = num2.length - 1; i >= 0; i--) {
			if (num2[i] != 0 && len < 5)
				maxArr2[len] = num1[i];
			len++;
		}
		for (int i = 0; i < 5; i++) {
			if (maxArr1[i] > maxArr2[i]) {
				maxArr2[i] = maxArr1[i];
			}
		}
		return maxArr2;
	}

	// The highest three-digit number that can be
	// assembled from the digits of the three arrays

	public static int TopNum(int[] num1, int[] num2, int[] maxArr2) {
		int[] sumArr = new int[num1.length + num2.length + maxArr2.length];
		for (int i = 0; i < num1.length; i++) {
			sumArr[i] = num1[i];
		}
		for (int i = num1.length; i < (num1.length + num2.length); i++) {
			sumArr[i] = num2[i - num1.length];
		}
		for (int i = (num1.length + num2.length); i < (num1.length + num2.length + maxArr2.length); i++) {
			sumArr[i] = maxArr2[i - (num1.length + num2.length)];
		}
		int maxNum = 0;
		int div = 100;
		Arrays.sort(sumArr);
		for (int i = sumArr.length - 1; i > (sumArr.length) - 4; i--) {
			maxNum += sumArr[i] * div;
			div = div / 10;
		}
		return maxNum;
	}

	public static int NumEven(int[] arr) {
		int c = 0, size = 0;
		boolean isZero = false;
		int[] copy = new int[arr.length];
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			c = arr[i];
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j] == c) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < copy.length; i++) {
			if (arr[i] != 0) {
				size++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				isZero = true;
			}
		}
		if (isZero == true) {
			size++;
		}
		int[] newArr = new int[size];
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			while (arr[j] != 0 && i <= 5) {
				newArr[i] = arr[j];
				i++;
				break;
			}
		}
		int mul = (int) (Math.pow(10, newArr.length));
		int num = 0;
		for (int j = 0; j < newArr.length; j++) {
			while (mul > 1) {
				if (newArr[j] % 2 == 0) {
					num += newArr[j] * mul;
				}
				mul = (int) (mul / 10);
			}
		}
		return num;
	}

	public static void main(String[] args) {

		int[] num1 = new int[25];
		int[] num2 = new int[25];

		for (int i = 0; i < 25; i++) {
			num1[i] = (int) (Math.random() * 10);
			num2[i] = (int) (Math.random() * 10);
		}

		System.out.println("1th array: " + Arrays.toString(num1));
		System.out.println("2th array: " + Arrays.toString(num2));

		System.out.println(BiggerNumArr(num1));
		System.out.println(BiggerNumArr(num2));
		int[] x = Top5MaxArr(num1, num2);
		System.out.println(Arrays.toString(x));
		System.out.println(TopNum(num1, num2, x));
//		System.out.println(NumEven(num1));

	}
}