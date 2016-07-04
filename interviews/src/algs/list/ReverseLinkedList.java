package algs.list;

import util.SingleLinkNode;

public class ReverseLinkedList {
    
    private ReverseLinkedList() {}
    
    public static SingleLinkNode reverse(SingleLinkNode node) {
        
        if(node == null || node.next == null) {
            return node;
        }
        // 1 , 2
        SingleLinkNode prev = null;
        SingleLinkNode curr = node;
        SingleLinkNode next = null;
        
        while(curr != null) {
            
            next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

}
