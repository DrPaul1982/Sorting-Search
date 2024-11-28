package src.app;

import java.util.Arrays;

public class ArrayUtils {

    public static <T extends Comparable> void mergeSort (T[] array) {
        int length = array.length;
        int mid = length / 2;

        if (length < 2) {
            return;
        }
        var left = Arrays.copyOfRange(array, 0, mid);
        var right = Arrays.copyOfRange(array, mid, length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static <T extends Comparable> void merge(T[] numbers, T[] left, T[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int l = 0;
        int r = 0;
        int i = 0;

        while (l < leftLength && r < rightLength) {
            if (lessOrEquals(left[l], right[r])) {
                numbers[i] = left[l];
                l++;
                i++;
            } else {
                numbers[i] = right[r];
                r++;
                i++;
            }
        }

        while (l < leftLength) {
            numbers[i] = left[l];
            l++;
            i++;
        }

        while (r < rightLength) {
            numbers[i] = right[r];
            r++;
            i++;
        }
    }

    private static <T extends Comparable> boolean lessOrEquals(T t, T t1) {
        return t.compareTo(t1) <= 0;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T target) {
        int left = 0;
        int right = array.length - 1;
        int iterations = 0;

        try {
            while (left <= right) {
                iterations++;
                int mid = left + (right - left) / 2;

                if (array[mid].equals(target)) {
                    return mid;
                }
                else if (lessOrEquals(array[mid], target)) {
                    left = mid + 1;
                } else if (lessOrEquals(target, array[mid])) {
                    right = mid - 1;
                }
            }
            return -1;
        } finally {
            System.out.println("Iterations to find the target: " + iterations);
        }
    }
}
