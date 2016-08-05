package algs.search;
/*
 * BinarySearch works by splitting the sorted array in half,
 * comaparing if our search value is above or below that half, then repeating
 * on the half it's in.
 * 
 * BS will return the index of the value if found, otherwise it will return -1
 */
public class BinarySearch {

    private BinarySearch() {}
    
    public static int search(int[] array, int val){
    	return search(array, 0, array.length-1, val);
    }

    public static int search(int[] array, int start, int end, int val) {
        
    	if(start>=end) {
    		if(array[start]!=val){
    			return -1;
    		}
    		return start;
    	}
    	
    	int mid = (start + end) / 2;
    	
    	if(array[mid]==val){
    		return mid;
    	}
    	if(array[mid]>val){
    		return search(array, start, mid-1, val);
    	}
    	
    	if(array[mid]<val) {
    		return search(array, mid+1, end, val);
    	}
    	
    	return -1;
    	

    }
}