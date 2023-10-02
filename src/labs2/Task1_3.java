package labs2;

public class Task1_3 {
	    public static void printPascalTriangle(int numRows) {
	        for (int row = 0; row < numRows; row++) {
	            for (int space = numRows - row; space > 1; space--) {
	                System.out.print(" ");
	            }
	            for (int col = 0; col <= row; col++) {
	                System.out.print(calculatePascalValue(row, col) + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int calculatePascalValue(int row, int col) {
	        if (col == 0 || col == row) {
	            return 1;
	        } else {
	            return calculatePascalValue(row - 1, col - 1) + calculatePascalValue(row - 1, col);
	        }
	    }

	    public static void main(String[] args) {
	        int numRows = 5;
	        printPascalTriangle(numRows);
	    }
	}
