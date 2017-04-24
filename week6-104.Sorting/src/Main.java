
public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexOfTheSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[indexOfTheSmallest] > array[i]) {
                indexOfTheSmallest = i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfTheSmallestStartingFrom = index;
        for (int i = index; i < array.length; i++) {
            if (array[indexOfTheSmallestStartingFrom] > array[i]) {
                indexOfTheSmallestStartingFrom = i;
            }
        }
        return indexOfTheSmallestStartingFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int index1OldValue = array[index1];
        array[index1] = array[index2];
        array[index2] = index1OldValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfTheSmallestStartingFrom(array, i), i);
        }
    }

}
