package lab4;

public class Question4 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*101);
		int num2 = (int)(Math.random()*101);
		if(num2 < num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}
		

	}

}
