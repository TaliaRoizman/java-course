package lab6;

public class Question3 {

	public static void main(String[] args) {
		int index = (int)(Math.random()*41)+10;
		System.out.println("index: " + index);
		int f1 = 1;
		int f2 = 1;
		System.out.println(1 + "th - " + f1);
		System.out.println(2 + "th - " + f2);
		for (int i = 3; i <= index; i++) {
			int temp;
			temp = f1;
			f1 = f2;
			f2 = temp + f2;
			System.out.println(i + "th - " + f2);
		}

	}

}
