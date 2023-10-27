package labs3;
public class Task1 {
    private int[] array;

    public Task1(int[] array) {
        this.array = array;
    }

    public int iterativeLinearSearch(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int recursiveLinearSearch(int target) {
        return recursiveLinearSearch(target, 0);
    }

    private int recursiveLinearSearch(int target, int index) {
        if (index >= array.length) {
            return -1;
        }
        if (array[index] == target) {
            return index;
        }
        return recursiveLinearSearch(target, index + 1);
    }
}