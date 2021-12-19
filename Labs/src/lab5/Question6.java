package lab5;

public class Question6 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100001);
		int copyNum = num;
		int oppositeNum;
		oppositeNum = 0;

		while (num > 0) {
			oppositeNum = (oppositeNum + (num % 10)) * 10;
			num = (int)(num/10);
		}
		oppositeNum = (int)(oppositeNum/10);
		if (oppositeNum == copyNum) {
			System.out.println(copyNum + " is palindrome.");
		} else {
			System.out.println(copyNum + " is not palindrome");
		}
	}
}
