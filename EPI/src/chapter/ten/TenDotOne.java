package chapter.ten;


/*
 * Test if a binary tree is balanced.
 */
public class TenDotOne {

    private TenDotOne(){}
    //A balanced tree is when the difference between the height of
    //it's left tree and it's right tree is at most 1;
    public static boolean isBalanced(BTNode root){

        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }

    public static int getHeight(BTNode root){

        if(root==null){
            return -1;
        }
        if(root.left==null && root.right==null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static void main(String[] args){
        BTNode nodeTwo = new BTNode(1, null, null);
        BTNode nodeThree = new BTNode(1, null, null);
        BTNode nodeOne = new BTNode(1, nodeThree, null);

        System.out.println(getHeight(nodeOne));

        System.out.println(isBalanced(nodeOne));

        nodeOne.right = new BTNode(1,null,null);
    }
}
