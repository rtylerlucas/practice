//given a sorted array of ints
//find me a particular goal (int) 
//O(logn) time

//[5 7 10 11 1 2 3 4 6]
//target = 10
public int bs(int[] arr, int target, int lo, int hi) {
    //If lo > hi
    if (lo > hi) {
        return -1;
    } else if (lo == hi && arr[lo] = target) {
        return lo;
    } else if (lo == hi) {
        //return error
        return -1;
    }
        
    //If lo == hi
        //check value with target
    //Get midpoint
    int m = (lo + hi) / 2;
    //Compare the midpoint value with arr[lo] and arr[hi]
    if (arr[midpoint] == target) {
        return midpoint;
    } else if (arr[midpoint] < arr[hi]) {
        //If right side sorted
        if (target < arr[hi] && target > arr[midpoint]) {
            return bs(arr, target, midpoint + 1, hi);
        } else {
            return bs(arr, target, lo, midpoint - 1);   
        }
    //Else right half
    } elseif (arr[midpoint] > arr[lo]) {
        //Left side sorted
        if (target > arr[lo] && target < arr[midpoint]) {
            return bs(arr, target, lo, midpoint - 1);
        } else {
            return bs(arr, target, midpoint + 1, hi);   
        }
    //If one side contains identical values TODO
    } 
    elseif (arr[midpoint] == arr[hi]) {
        return midpoint;
    }
    //Depending on which is sorted side, check if target is in sorted side
    //If target is less than midpoint --> bs(arr, left half)
    
}

//two single linked list, list a list b 
//pointer to head of both
//return node of intersection: contains same node 
//( Node==Node) Node.value==Node.value
//runtime solution: O(n + m)
//n+m solution: iterate through both lists a and b. 
//if their child is ever the same or current node is the same, then return child, otherwise,
//return error.
//if intersection, return node 
N N Q
M M Q M M 

 List1           M Q M M M
  List2          N Q 
            
            
            //count length, 
         
         
         //WRONG
public Node findIntersection(Node rootOne, Node rootTwo){

    if(rootOne==null||rootTwo==null)
        return null;
        
    if(rootOne==rootTwo)
        return rootOne;    

    while(rootOne.hasNext()&&rootTwo.hasNext()){
        findIntersection(rootOne.next(), rootTwo.next());
    }
    
    return null;
}