package chapter.twelve;

public class TweleveDotOne {
    /*
     * Given a sorted array, find first occurance of k
     * Find a k, then bounce left
     */
    public static int firstOccuranceBSearch(int k, int[] arr){
        int s = 0;
        int e = arr.length - 1;
        int m = s + (e - s) / 2;
        int result = -1;
        while(s <= e ){
            if(k < arr[m]){
                e = m - 1;
            } else if(k > arr[m]){
                s = m+1;
            } else{
                result = m;
                e = m - 1;
            }
            m = s + (e-s) / 2;
        }
        return result;
    }
    //recursive bSearch Impl
    public static int recursiveBSearch(int k, int[] arr, int s, int e){

        if(s > e){
            return -1;
        }
        int middleIndex = s + (e - s) / 2;
        if(arr[middleIndex] == k){
            return middleIndex;
        } else if( arr[middleIndex] > k ){
            return recursiveBSearch(k, arr, s, middleIndex);
        }  else{
           return recursiveBSearch(k, arr, middleIndex + 1, e);
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(recursiveBSearch(2, arr, 0, arr.length-1));
        int[] arr2 = {1, 2,2,2,2,3, 4, 5, 6, 7, 8, 8};
        System.out.println(firstOccuranceBSearch(8, arr2));
    }
}
