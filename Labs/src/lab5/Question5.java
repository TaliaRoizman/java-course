package lab5;

public class Question5 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10001);
		int copy1 = num;
		int copy2 = num;
		int copy3 = num;
		int copy4 = num;
		int copyNum = num;
		int c = 0;
		int rightDigit;
		
		// number of digits
		while (num > 0) {
			c++;
			num = (int) (num / 10);
		}
		System.out.println("To the number " + copy1 + " has " + c + " digits.");
		
		// right digit
		rightDigit = copyNum % 10;
		System.out.println("The right digit of the number " + copyNum + " is " + rightDigit);
		
		//left digit
		while (copy2 > 9) {
			copy2 = (int) (copy2 / 10);
		}
		System.out.println("The left digit of " + copyNum + " is " + copy2);
		
		//sum digits
		int sum = 0;
		while (copy3 > 0) {
			sum += copy3 % 10;
			copy3 = (int)(copy3/10);
		}
		System.out.println("sum digits: " +sum);

		//Opposite order
		System.out.print("Opposite order: ");
		while (copy4 > 0) {
			System.out.print(copy4 % 10);
			copy4 = (int)(copy4 / 10);
		}
	}
}
