//Find smallest number

yo

//Given: Number 
//Objective: Find the smallest number created when each adjacent digit is replaced with the larger one
// Smallest one after one replacement
//smallest number after single replacement iteration


//Example: 233458 this one -> 23, 33, 34, 45, 58
//233458 ->  33458 (replace 2 with 3)
//233458 -> 23458 (3 w 3 or 3 w 4) <-
//233458 -> 23358 (4 w 5)
//233458 -> 23348 (5 w 8) operations

//Answer: 23348 final answer 

//Don't worry about runtime, focus on accuracy


public int findSmallest(int input) {

    int smallest = Integer.MAX_VALUE;
    //iterate across number
    //always replace, take larger number
    //update minimum result
    
    String in = String.valueOf(input);
    
    //track progress on replacement window
    for(int i = 0; i < n-1; i+=1) {
         
        int smaller = Math.max(Character.getNumericValue(in.charAt(i)), Character.getNumericValue(in.charAt(i+1))); 
        
        String tempRes = in.substring(0, i)) + smaller + in.subString(i+1, in.length());
        
        smallest = Math.min(smallest, Character.getNumericValue(tempRes));
        
    }
}