package lab5;

public class Question3 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10001);
		int copy = num;
		while (num > 9) {
			num = (int)(num / 10);
		}
		System.out.println("To left digit of " + copy + " is " + num);
	}
}
