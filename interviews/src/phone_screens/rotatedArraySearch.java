/*
 * Question Description: Given a sorted array that has been transposed (that is, a portion has been removed from one end and attached to the other), write a function to determine if a given number is present in the array.
Examples: [6 7 1 2 3 4 5] => find 1 or 4; [9 13 32 54 1 2 5] => find 1 or 9
 */
 
 [1, 2, 3, 4, 5] 
 
 [4, 1, 2]
 
 [6 7 1 2 3 4 5]; We are searching for 1
 
 [ 1 , 2 , 3]
 
 //The input to the search a single int
 
 //We aquire the mid, 
 //We check the last element, and determine if it's bigger than the mid.
 //If bigger, we know the right side is increasing. (If search number is big, search right side)
 
 
 public int findNumber(int[] array, int x){
     return findNumber(array, x, 0, array.length);
 }
 
 private int findNumber(int[] array, int x, int s, int e){
 
     int midIndex = (s + e) / 2;
     int mid = array[midIndex];
     int last = array[e];
     
     if(mid == x){
         return midIndex;
     }
     
     if(last > mid){
         if(x > mid) { // high side
             findNumber(array, x, midIndex, e);
         }
         
         else{ // low side
             findNumber(array, x, 0, midIndex);
         }
     }
     else{ // last < mid
     
         if(x < mid && x < last) { // right side search
             findNumber(array, x, midIndex, e);
         } else if(x < mid && x > last){
             findNumber(array, x, 0, midIndex);
         }
          if(x > mid) { 
             findNumber(array, x, midIndex, e);
         } 
     }
 }

 public interface FirstCommonAncestor {
 
    /**
     * Given two nodes of a tree,
     * method should return the deepest common ancestor of those nodes.
     *
     *          A
     *         / \
     *        B   C
     *       / \
     *      D   E
     *         / \
     *        G   F
     *
     *  commonAncestor(D, F) = B
     *  commonAncestor(C, G) = A
     *  commonAncestor(E, B) = B // parent child returns parent
     */
    Node commonAncestor(Node one, Node two);
}
 
class Node {
 
    final Node parent;
    final Node left;
    final Node right;
 
 
    public Node(Node parent, Node left, Node right) {
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
 
    boolean isRoot() {
        return parent == null;
    }
}

