package Labs4;

public class Task42_1 {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 3 };

		System.out.println("Original array:");
		printArray(array);

		mergeSort(array);

		System.out.println("Sorted array:");
		printArray(array);
	}

	public static void mergeSort(int[] array) {
		int n = array.length;

		if (n > 1) {
			int mid = n / 2;

			int[] left = new int[mid];
			int[] right = new int[n - mid];

			for (int i = 0; i < mid; i++) {
				left[i] = array[i];
			}
			for (int i = mid; i < n; i++) {
				right[i - mid] = array[i];
			}

			mergeSort(left);
			mergeSort(right);


			merge(left, right, array);
		}
	}

	public static void merge(int[] left, int[] right, int[] result) {
		int i = 0; 
		int j = 0; 
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] >= right[j]) {
				result[k] = left[i];
				i++;
			} else {
				result[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			result[k] = right[j];
			j++;
			k++;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
