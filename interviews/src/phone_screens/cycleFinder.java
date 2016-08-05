// write a method that returns true if there is a cycle, false if no cycle
/*

*
*     
A --> B --> C --> C  ==> return false
A --> B --> C --> A ==> return true

*/
Node
------
int data
Node next


public class CycleFinder {

    private CycleFinder(){}
    
    public static boolean hasCycle(Node head){
        
        HashSet<Integer> set = new HashSet<>();
        
        while(head!=null){
            if(set.contains(head.data)){
                return true;
            }
            set.put(head);
            head = head.next;
        }
        return false;
    }
    
    public static boolean hasCycleSlow(){
        
    }
}

//Tortoise and hare:: http://codingfreak.blogspot.com/2012/09/detecting-loop-in-singly-linked-list_22.html 
O(n) time, O(1) space