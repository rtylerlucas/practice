package chapter.eight;

/*
 * Merge Two singly linked sorted lists
 */
public class EightDotOne {

    private EightDotOne(){}

    /*
     * Given two head nodes, merge the sorted lists into one single resulting list.
     */
    public static Node mergeLists(Node a, Node b){

        if(a == null) {
            return b;
        }
        if(b == null){
            return a;
        }

        Node head = a.data < b.data ? a : b;

        while(a != null && b != null){
            Node aNext = a.next;
            Node bNext = b.next;

            if(a.data < b.data){
                a.next = b;
                a = aNext;
            } else{
                b.next = a;
                b = bNext;
            }
        }



        return head;
    }

    public static void main(String[] args){
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        a2.next = a3;
        a1.next = a2;

        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        b2.next = b3;
        b1.next = b2;
        Node n = EightDotOne.mergeLists(a1, b1);
        while(n != null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
