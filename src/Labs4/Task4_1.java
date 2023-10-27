package Labs4;

public class Task4_1 {
	    public static void main(String[] args) {
	        int[] array = {5, 2, 9, 1, 3};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        selectionSort(array);
	        
	        System.out.println("Sorted array in descending order:");
	        printArray(array);
	    }
	    
	    public static void selectionSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int maxIndex = i;
	            
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] > array[maxIndex]) {
	                    maxIndex = j;
	                }
	            }
	            
	            int temp = array[i];
	            array[i] = array[maxIndex];
	            array[maxIndex] = temp;
	        }
	    }
	    
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}