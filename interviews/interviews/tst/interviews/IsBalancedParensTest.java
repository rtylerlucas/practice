package interviews;

import org.junit.Assert;
import org.junit.Test;

import interview_questions.IsBalancedParentheses;

public class IsBalancedParensTest {

	private static final String POSTIVE1 = "[]";
	private static final String POSTIVE2 = "[{}]";
	private static final String POSTIVE3 = "[]{}()";
	private static final String POSTIVE4 = "[{{}}]";
	private static final String NEGATIVE1 = "][";
	private static final String NEGATIVE2 = "({)}"; //tough one
	private static final String NEGATIVE3 = "()}";
	@Test
	public void testPositive(){
		Assert.assertTrue(IsBalancedParentheses.isBalanced(POSTIVE1));
		Assert.assertTrue(IsBalancedParentheses.isBalanced(POSTIVE2));
		Assert.assertTrue(IsBalancedParentheses.isBalanced(POSTIVE3));
		Assert.assertTrue(IsBalancedParentheses.isBalanced(POSTIVE4));
	}
	
	@Test
	public void testNegative(){
		Assert.assertFalse(IsBalancedParentheses.isBalanced(NEGATIVE1));
		Assert.assertFalse(IsBalancedParentheses.isBalanced(NEGATIVE3));
		// Assert.assertFalse(IsBalancedParentheses.isBalanced(NEGATIVE2));
	}
	
}
