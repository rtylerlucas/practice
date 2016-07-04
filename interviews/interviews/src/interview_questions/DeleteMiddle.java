package interview_questions;

/*given a node that is guaranteed to be the middle node,
 * delete the node from the singly linked list
 */
public class DeleteMiddle {

    private static class LinkedListNode {

        private String data;
        private LinkedListNode next;

        public LinkedListNode(String data, LinkedListNode next) {
            this.data = data;
            this.next = next;
        }   
    }
    /*
     * override the node with the next value, point current node to next.next value.
     */
    public static boolean deleteMiddle(LinkedListNode node){
        if(node==null || node.next==null){
        	return false;
        }
            
        LinkedListNode nextNode = node.next;
        node.data = nextNode.data;
        
        if(nextNode.next!=null){
            LinkedListNode nextNextNode = nextNode.next;
            node.next = nextNextNode;
        }
        //otherwise, we're at the end
        else{
            node.next = null;
        }
        
        return true;
    }

    static void printList(LinkedListNode cur) {
        System.out.print("List: ");
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        String[] testSet = new String[]{"T", "I", "G", "E", "R"};
        //Make linked list
        LinkedListNode r = new LinkedListNode(testSet[4], null);
        LinkedListNode e = new LinkedListNode(testSet[3], r);
        LinkedListNode g = new LinkedListNode(testSet[2], e);
        LinkedListNode i = new LinkedListNode(testSet[1], g);
        LinkedListNode t = new LinkedListNode(testSet[0], i);
        
        printList(t);
        System.out.println("Deleting 'G': " + deleteMiddle(g));
        printList(t);
        
    }
}