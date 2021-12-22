package lab10;

public class Question4 {

	public static void main(String[] args) {
		int sum = 0;
		int[][] grades = new int[20][10];
		for (int i = 0; i < grades.length; i++) {
			int sumStudent = 0;
			for (int j = 0; j < grades[1].length; j++) {
				grades[i][j] = (int) (Math.random() * 21) + 80;
				sumStudent += grades[i][j];
			}
			System.out.println("Average for student " + (i+1) + ": " + (sumStudent / 10));
			sum += (sumStudent/10);
		}
		System.out.println("Average class: " + (sum / 20));
	}
}
