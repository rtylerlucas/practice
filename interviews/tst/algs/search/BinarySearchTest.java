package algs.search;

import org.junit.Test;

import org.junit.Assert;

public class BinarySearchTest {

    public static final int[] arr1 = {1, 3, 5, 7, 9};
    public static final int[] arr2 = {1};

    @Test
    public void testHappySearch() {
        Assert.assertEquals(1, BinarySearch.search(arr1, 3));
        Assert.assertEquals(-1, BinarySearch.search(arr2, 3));
        Assert.assertEquals(0, BinarySearch.search(arr2, 1));

        Assert.assertEquals(4, BinarySearch.search(arr1, 9));
    }
}
