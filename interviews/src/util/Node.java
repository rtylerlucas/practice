package util;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right){
        this.value=value;
        this.left=left;
        this.right=right;
    }

    public Node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }

    public int getValue(){
        return value;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
}
