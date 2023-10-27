package Labs4;

public class Task4_2 {
	    public static void main(String[] args) {
	        int[] array = {5, 2, 9, 1, 3};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        bubbleSort(array);
	        
	        System.out.println("Sorted array in descending order:");
	        printArray(array);
	    }
	    
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] < array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	    
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}