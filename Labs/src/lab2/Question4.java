package lab2;

public class Question4 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*101);
		int num2 = (int)(Math.random()*101);
		int num3 = (int)(Math.random()*101);
		int max = 0; 
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		if ((num1 > num2) && (num1 > num3)) {
			max = num1; 
		} else if ((num2 > num1) && (num2 > num3)) {
			max = num2;
		} else if ((num3 > num1) && (num3 > num2)){
			max = num3;
		}
		System.out.println("max: " + max);
	}

}
