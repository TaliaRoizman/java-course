package a;

import java.util.Arrays;
import java.util.Iterator;

public class a {

	public static int TripleDigits(int[] arr) {
		int tdNum = 0, maxNumLeft = 0, maxNumRight =0, maxNum;
		int[] revArr = reverse(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			tdNum = arr[i] * 100 + arr[i + 1] * 10 + arr[i + 2];
			if (tdNum > maxNumLeft) {
				maxNumLeft = tdNum;
			}
		}
		tdNum = 0;
		for (int i = 0; i < revArr.length - 2; i++) {
			tdNum = revArr[i] * 100 + revArr[i + 1] * 10 + revArr[i + 2];
			if (tdNum > maxNumRight) {
				maxNumRight = tdNum;
			}
		}
		if(maxNumRight > maxNumLeft) {
			maxNum = maxNumRight;
		}else {
			maxNum = maxNumLeft;
		}
		return maxNum;
		
	}
	
	public static int[] reverse(int[] arr) {
		
		int[] arr2 = new int[arr.length];
		int len = arr.length;
		for(int i = 0; i < arr2.length; i++) {
				arr2[i] = arr[len-1];
				len--;
			}
		return arr2;
	}

	public static int[] distinct(int[] arr1, int[] arr2) {

		int size = 0, c;
		boolean isUniqe = true;
		int[] distinct = new int[10];

		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					isUniqe = false;
				}
			}
			if (isUniqe == true) {
				distinct[size] = arr1[i];
				size++;
			}
			isUniqe = true;
		}
	
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					isUniqe = false;
				}
			}
			if (isUniqe == true) {
				distinct[size] = arr2[i];
				size++;
			}
			
			for (int t = 0; t < distinct.length; t++) {
				c = distinct[t];
				for (int j = (t + 1); j < distinct.length; j++) {
					if (distinct[j] == c) {
						distinct[j] = -1;
					}
				}
			}
			
			isUniqe = true;
		}
		Arrays.sort(distinct);
		return distinct;
	}
	
	public static int numDistinct(int[] arr) {
		int num=0, c=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				c++;
			}
		}
		int mul = ((int)(Math.pow(10, c)))/10;
		for (int i = arr.length-1; i > 0; i--) {
			if(arr[i] != -1) {
				num += arr[i]*mul;
			}
			mul = mul/10;
		}
		return num;
	}

	public static void main(String[] args) {

		// Question 1:
		int[] num1 = new int[15];
		int[] num2 = new int[15];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = (int) (Math.random() * 10);
			num2[i] = (int) (Math.random() * 10);
		}

		// Question 2:
		System.out.println("The first array: " + Arrays.toString(num1));
		System.out.println("The secound array: " + Arrays.toString(num2));

		// Question 3:
		System.out.println("The highest three-digit number that can be found in the 1st array: " + TripleDigits(num1));

		// Question 4:
		System.out.println("distinct: " + Arrays.toString(distinct(num1, num2)));
		
		// Question 5:
		System.out.println("The number from distinct: " + numDistinct(distinct(num1, num2)));
		
		
	}

}
