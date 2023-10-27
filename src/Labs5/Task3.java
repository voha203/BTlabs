package Labs5;

public class Task3 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 5, 2}, { 4, 5, 7, 9} };
		int[][] b = { { 7, 8, 5}, { 9, 10, 7 }, { 11, 12, 9 },{3, 3, 5, 6} };

		int[][] result = multiply(a, b);

		System.out.println("Matrix a:");
		printMatrix(a);

		System.out.println("Matrix b:");
		printMatrix(b);

		System.out.println("Result of multiplication:");
		printMatrix(result);
	}

	public static int[][] multiply(int[][] a, int[][] b) {
		int rowsA = a.length;
		int colsA = a[0].length;
		int colsB = b[0].length;

		int[][] result = new int[rowsA][colsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return result;
	}

	public static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
