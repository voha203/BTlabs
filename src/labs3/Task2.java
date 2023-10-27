package labs3;

public class Task2 {
    private int[] array;

    public Task2(int[] array) {
        this.array = array;
    }

    public int iterativeBinarySearch(int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int recursiveBinarySearch(int target) {
        return recursiveBinarySearch(target, 0, array.length - 1);
    }

    private int recursiveBinarySearch(int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return recursiveBinarySearch(target, mid + 1, right);
        } else {
            return recursiveBinarySearch(target, left, mid - 1);
        }
    }
}