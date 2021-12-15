package e;

public class MultiDim3 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 3, 5 }, { 6, 8, 3, 8, 9 }, { 3, 3, 3, 1 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

}
