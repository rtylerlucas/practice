package phone_screens;

import java.util.HashSet;

/*
* You have a diving board which is created by placing a bunch of planks end-to-end
* You have 2 types of planks: shorter and longer
* Get all possible diving board lengths
* You have to use k planks
* e.g k = 2, shorter = 3, longer = 7 ===> 6, 10, 14
*
*k = 3
* S, S, S ==> 3S + 0L = K  
* S, S, L ==> 2S + 1L = K
* S, L, L ==> 1S + 2L = K
* L, L, L ==> 0L + 3L = K

* return [3S, 2S + L, S + 2L, 3L]
*/

/*
 * Find all Possibility of arrangements of k planks. 
 */ 
public class DivingBoard {

	
	private DivingBoard(){}
	 
	 public static HashSet<Integer> getAllLengths(int k, int s, int l){
	 
	     HashSet<Integer> resultSet = new HashSet<>();
	     int currLength;
	     for(int i = 0; i <= k; i++){
	         currLength = s * (k - i) + (l * i);
	         resultSet.add(currLength); 
	     } 
	     return resultSet;
	 }
	 
	 /*
	  * Follow up: What if you jave three sizes?
	  * 
	  * 	 As + Bm + Cl = k
	 	 AB exclusive
		 AC exclusive
		 BC exclusive
		 ABC mixed
	  */
}

