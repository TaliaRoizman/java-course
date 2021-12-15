package lab2;

public class Question2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*101);
		System.out.println("num: " + num);
		if(num < 50) {
			System.out.println("small!");
		} else {
			System.out.println("Big!");
		}
		if(num % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
