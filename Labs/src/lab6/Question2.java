package lab6;

public class Question2 {

	public static void main(String[] args) {
		int index = (int) (Math.random() * 41) + 1;
		int f1 = 1;
		int f2 = 1;
		int temp;
		while (index > f1) {
			temp = f1;
			f1 = f2;
			f2 = temp + f2;
		}
		System.out.println("Next fibonacci number after " + index + " is " + f1);

	}

}
