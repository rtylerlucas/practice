package algs.sorting;

import org.junit.Test;

import algs.sort.MergeSort;

import java.util.Arrays;

import org.junit.Assert;

public class MergeSortTest {

    public static final int[] UNSORTED_ARRAY = {1,4,6,2,3,5};
    public static final int[] EMPTY_ARRAY = {};

    public static final int[] SORTED_ARRAY = {1,2,3,4,5,6};

    @Test
    public void testSort() {
        Assert.assertTrue(Arrays.equals(SORTED_ARRAY, MergeSort.sort(UNSORTED_ARRAY)));
        Assert.assertTrue(Arrays.equals(EMPTY_ARRAY, EMPTY_ARRAY));
    }
}
