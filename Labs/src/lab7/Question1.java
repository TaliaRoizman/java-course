package lab7;

public class Question1 {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c' };
		int a_c = 0;
		int ac_c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				a_c++;
			}
		}
		System.out.println("a appear " + a_c + " times");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'c') {
				ac_c++;
			}
		}
		System.out.println("a and c appears " + ac_c + " times");

	}

}
