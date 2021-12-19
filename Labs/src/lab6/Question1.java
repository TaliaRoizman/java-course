package lab6;

public class Question1 {

	public static void main(String[] args) {
		int f1 = 1;
		int f2 = 1;
		System.out.println(1 + "th - " + f1);
		System.out.println(2 + "th - " + f2);
		for (int i = 3; i <= 40; i++) {
			int temp;
			temp = f1;
			f1 = f2;
			f2 = temp + f2;
			System.out.println(i + "th - " + f2);
		}

	}

}
