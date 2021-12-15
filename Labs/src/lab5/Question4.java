package lab5;

public class Question4 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10001);
		System.out.println("Original number: " + num);
		while(num > 0) {
			System.out.print(num%10);
			num = (int)(num/10);
		}
		

	}

}
