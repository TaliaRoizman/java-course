package lab1;

public class Question4 {

	public static void main(String[] args) {
		int minutes = (int)(Math.random()*251)+100; 
		System.out.println("Minutes: " + minutes);
		System.out.println("Hours: " + (minutes/60) + ", Minutes: " + (minutes%60));

	}

}
