package labs2;

public class Task1_1 {
	public static int problem1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return problem1(n - 1) + ((int) Math.pow(-1, n + 1)) * n;
        }
    }

    public static int problem2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return problem2(n - 1) + factorial(n);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int problem3(int n) {
        if (n == 1) {
            return 1;
        } else {
            return problem3(n - 1) + (int) Math.pow(n, 2);
        }
    }

    public static double problem4(int n) {
        if (n == 0) {
            return 1;
        } else {
            return problem4(n - 1) + (1.0 / product(2, n));
        }
    }

    public static double product(int start, int end) {
        if (start == end) {
            return start;
        } else {
            return start * product(start + 2, end);
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;
        int n3 = 3;
        int n4 = 0;

        System.out.println("Problem 1: S(" + n1 + ") = " + problem1(n1));
        System.out.println("Problem 2: S(" + n2 + ") = " + problem2(n2));
        System.out.println("Problem 3: S(" + n3 + ") = " + problem3(n3));
        System.out.println("Problem 4: S(" + n4 + ") = " + problem4(n4));
    }
}
