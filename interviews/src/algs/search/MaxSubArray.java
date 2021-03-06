package algs.search;
/*
 * Given an array, find the maximum contiguous subarray whose values
 * equate to the greatest sum.
 *
 * Given:
 * {1, 3, 5, -4}  --> {1, 3, 5}
 * {-5, 6 -1, 4, -4, 5, 2 }
 *
 */
public class MaxSubArray {

    private class ContinuousSubIndices {
        int start;
        int end;
        int sum;

        ContinuousSubIndices(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }
    }

    private MaxSubArray() {}

    public static int[] find(int[] array) {
        return find(array, 0, array.length - 1);
    }

    private static int[] find(int[] array, int start, int end) {

        //base case: empty or 1
        if(start <= end) {
            return array;
        }

        int mid = (start + end) / 2;
        return array;


    }
}
