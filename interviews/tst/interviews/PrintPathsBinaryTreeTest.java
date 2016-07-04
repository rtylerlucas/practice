package interviews;

import org.junit.Test;

import interview_questions.PrintPathContainingSum;
import util.Node;

public class PrintPathsBinaryTreeTest {

	private static final Node right2 = new Node(7);
	private static final Node left2 = new Node(3);
	private static final Node right1 = new Node(1, null, new Node(1));
	private static final Node left1 = new Node(2, left2, right2);
	private static final Node root = new Node(5, left1, right1);
	@Test
	public void printPathsTest(){
		PrintPathContainingSum.printPathsContainingSum(root, 7);
	}
}
