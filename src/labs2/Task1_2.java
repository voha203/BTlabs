package labs2;

public class Task1_2 {
	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }

	    public static void printFibonacciSequence(int n) {
	        System.out.print("Fibonacci Sequence up to " + n + ": ");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        printFibonacciSequence(n);
	    }
	}
