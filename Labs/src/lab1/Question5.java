package lab1;

public class Question5 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*101);
		int num2 = (int)(Math.random()*101);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		if(num1 > num2) {
			System.out.println("max: " + num1);
		}
		else {
			System.out.println("max: " + num2);
		}

	}

}
