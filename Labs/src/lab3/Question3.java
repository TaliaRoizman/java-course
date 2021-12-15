package lab3;

public class Question3 {

	public static void main(String[] args) {
		int year = (int) (Math.random() * 2022);
		System.out.print("The Year " + year);
		if (((year % 4 == 0) && (year % 100 != 0)) || ((year%400) == 0)) {
			System.out.println(" leap");
		} else {
			System.out.println(" Not leap");		
		}

	}

}
