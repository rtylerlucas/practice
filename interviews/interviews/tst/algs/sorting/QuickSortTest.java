package algs.sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import algs.sort.QuickSort;

public class QuickSortTest {
    
    public static final int[] UNSORTED_ARRAY = {1,5,6,3,2,4};
    public static final int[] EMPTY_ARRAY = {};
    
    public static final int[] SORTED_ARRAY = {1,2,3,4,5,6};

    @Test
    public void sortTest() {
        System.out.println(Arrays.toString(QuickSort.sort(UNSORTED_ARRAY)));
        Assert.assertTrue(Arrays.equals(SORTED_ARRAY, QuickSort.sort(UNSORTED_ARRAY)));
        Assert.assertTrue(Arrays.equals(EMPTY_ARRAY, QuickSort.sort(EMPTY_ARRAY)));
    }
}
