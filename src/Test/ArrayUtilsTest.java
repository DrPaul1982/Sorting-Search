package src.Test;


import org.testng.annotations.Test;
import src.app.ArrayUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArrayUtilsTest {

    @Test // checking if the mergeSort method works correctly
    public void testMergeSort() {
        Integer[] arr = {3, 21, 1, 5, -6};
        Integer[] expected = {-6, 1, 3, 5, 21};
        ArrayUtils.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test // test binary search
    public void testBinarySearch() {
        Integer[] arr = {1, 3, 5, 8, 10, 20};
        ArrayUtils.binarySearch(arr, 5);
        int expected = 2;
        assertEquals(expected, ArrayUtils.binarySearch(arr, 5));
    }
}