package labs2;

public class Task1_4 {
	    public static void solveTowersOfHanoi(int numDisks, char source, char auxiliary, char destination) {
	        if (numDisks == 1) {
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	        } else {
	            solveTowersOfHanoi(numDisks - 1, source, destination, auxiliary);
	            System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);
	            solveTowersOfHanoi(numDisks - 1, auxiliary, source, destination);
	        }
	    }

	    public static void main(String[] args) {
	        int numDisks = 3;
	        char source = 'A';
	        char auxiliary = 'B';
	        char destination = 'C';

	        solveTowersOfHanoi(numDisks, source, auxiliary, destination);
	    }
	}
