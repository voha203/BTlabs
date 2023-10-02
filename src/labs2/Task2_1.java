package labs2;

public class Task2_1 {
	    public static void drawPyramid(int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("X");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int n = 4;
	        drawPyramid(n);
	    }
	}
