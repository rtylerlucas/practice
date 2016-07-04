package algs.sort;

import java.util.Arrays;
/*
 * Time Complexity: O(n^2)
 * Auxilary Space Complexity: O(1)
 */
public class QuickSort {
    
    private QuickSort() {}
    
    public static int[] sort(int[] unsortedArray) {
        return sort(unsortedArray, 0, unsortedArray.length);
    }

    /*
     * Divide: Array into sections less than pivot
     * and sections greater than pivot,
     */
    
    /*
     * Conquer: Array by putting elements less than pivot
     * to the left of the pivot, and elements greater than
     * pivot to the right of the pivot
     */
    private static int[] sort(int[] arr, int start, int end) {
        /*
         * BaseCase: arr length <=1
         */
        System.out.println(Arrays.toString(arr));
        if(start >= end-1) {
            return arr;
        }
        //We will pick the end index value as our pivot
        int pIndex = end-1;
        int pivot = arr[pIndex];
        System.out.println("Pivot: " + pivot + "\npIndex: " + pIndex);

        for(int i = end-2; i >= start; i--) {
            //moving backwards, if the value is greater than my pivot, swap,
            //otherwise, keep going.
            if( arr[i] > pivot ) {
                if(i==pIndex-1) {
                    swap(arr, i, pIndex);
                } else {
                    swap(arr, i, pIndex-1);
                    swap(arr, pIndex-1, pIndex);
                }
                pIndex--;
            }
        }
        sort(arr, start, pIndex);
        sort(arr, pIndex, end);
        return arr;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int iVal = arr[i];
        arr[i] = arr[j];
        arr[j] = iVal;
    }
    
}
