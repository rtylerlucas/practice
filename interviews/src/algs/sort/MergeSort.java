package algs.sort;

import java.util.Arrays;

/*
 * Time Complexity: O( n*log(n) )
 * Auxilary Space: O(n)
 */
public class MergeSort {

    private MergeSort() {}

    public static int[] sort(int[] numbersArray){

        return sort(numbersArray, 0 , numbersArray.length);
    }

    private static int[] sort(int[] numbersArray, int start, int end) {

        /*
         * BaseCase: The length of our arr is 1 or 0;
         * This section is considered sorted!
         */
        if( start >= end-1) {
            return numbersArray;
        }

        int halfWay = (start + end) / 2;
        //"Divide" the sort in two
        int[] sortedLeft = sort(Arrays.copyOfRange(numbersArray, start, halfWay));
        int[] sortedRight = sort(Arrays.copyOfRange(numbersArray, halfWay, end));
        //"Combine" the results!
        return merge(sortedLeft, sortedRight, numbersArray);
    }

    /*
     * "Conquer" the merge:
     * This function assumes the leftArray and the rightArray
     * are both sorted, so it simply combines the two!
     */
    private static int[] merge(int[] leftArray, int[] rightArray, int[] resultArray) {
        System.out.println("Merging:" + Arrays.toString(leftArray) + Arrays.toString(rightArray));
        //Edge Case Protection
        if( (leftArray.length + rightArray.length) != resultArray.length) {
            return null;
        }

        int li = 0;
        int ri = 0;
        int k = 0;

        while( li<leftArray.length && ri<rightArray.length ) {
            if( leftArray[li] <= rightArray[ri] ){
                resultArray[k] = leftArray[li];
                li++;
            } else {
                resultArray[k] = rightArray[ri];
                ri++;
            }
            k++;
        }

        while( li<leftArray.length ) {
            resultArray[k] = leftArray[li];
            li++;
            k++;
        }
        while( ri<rightArray.length ) {
            resultArray[k] = rightArray[ri];
            ri++;
            k++;
        }
        return resultArray;
    }
}

//Resource: https://www.khanacademy.org/computing/computer-science/algorithms/merge-sort/a/overview-of-merge-sort


