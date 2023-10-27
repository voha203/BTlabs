package Labs5;

public class Task2 {
	    public static void main(String[] args) {
	        int[][] a = {{1, 2, 3}, {4, 5, 6}};
	        int[][] b = {{7, 8, 9}, {10, 11, 12}};
	        
	        int[][] result = subtract(a, b);
	        
	        System.out.println("Matrix a:");
	        printMatrix(a);
	        
	        System.out.println("Matrix b:");
	        printMatrix(b);
	        
	        System.out.println("Result of subtraction:");
	        printMatrix(result);
	    }
	    
	    public static int[][] subtract(int[][] a, int[][] b) {
	        int rows = a.length;
	        int columns = a[0].length;
	        
	        int[][] result = new int[rows][columns];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[i][j] = a[i][j] - b[i][j];
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
