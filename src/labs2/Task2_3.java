package labs2;

public class Task2_3 {
	    public static void drawPyramid(int height, int totalHeight) {
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < totalHeight - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("X");
	            }
	            System.out.println();
	        }
	    }

	    public static void drawChristmasTree(int n) {
	        int totalHeight = n * 2 - 1;
	        for (int i = 1; i <= n; i++) {
	            drawPyramid(i, totalHeight);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 4;
	        drawChristmasTree(n);
	    }
	}
