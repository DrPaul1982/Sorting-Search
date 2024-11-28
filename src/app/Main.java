package src.app;

import java.util.Arrays;

import static src.app.RandomArray.randomArray;

public class Main extends ArrayUtils {
    public static void main(String[] args) {

        Integer[] testArray = randomArray(100);
        System.out.println("Before sorting: " + Arrays.toString(testArray));
        mergeSort(testArray);
        System.out.println("After sorting: " + Arrays.toString(testArray));


        int target = 4;
        System.out.println("Searching for target: " + target);

        int result = binarySearch(testArray, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
