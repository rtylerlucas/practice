package algs.list;

import org.junit.Before;
import org.junit.Test;

import util.SingleLinkNode;

public class ReverseLinkedListTest {

    private final SingleLinkNode node_0 = new SingleLinkNode(0);

    private final SingleLinkNode node_1 = new SingleLinkNode(1);

    private final SingleLinkNode node_2 = new SingleLinkNode(2);
    
    private final SingleLinkNode node_3 = new SingleLinkNode(3);

    @Before
    public void setup() {
        
        node_2.next = node_3;
        node_1.next = node_2;
        node_0.next = node_1;
    }
    
    @Test
    public void testReverse() {
        
        printLL(node_0);
        ReverseLinkedList.reverse(node_0);
        printLL(node_3);
    }
    
    private static void printLL(SingleLinkNode node) {
        SingleLinkNode head = node;
        
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("\n");
    }
}
