package interview_questions;

public class IsBalancedParentheses {

	public static boolean isBalanced(String str){
		
		if(str==null)
			return false;
		
		int bracketCount = 0;
		int braceCount = 0;
		int parenCount = 0;
		
		for(int i=0; i<str.length(); i++){
			char curr = str.charAt(i);
			
				if (curr=='['){
					bracketCount++;
				}
					
				else if (curr==']'){
					bracketCount--;
					if(bracketCount<0){
						return false;
					}
//					if(bracketCount==0 && (parenCount>0||braceCount>0)){
//						return false;
//					}
				}	
				else if (curr=='{')
					braceCount++;
					
				else if (curr=='}'){
					braceCount--;
					if(braceCount<0){
						return false;
					}
//					if(braceCount==0 && (parenCount>0||bracketCount>0)){
//						return false;
//					}
				}	
				else if (curr=='(')
					parenCount++;
					
				else if (curr==')'){
					parenCount--;
					if(parenCount<0){
						return false;
					}
//					if(parenCount==0 && (bracketCount>0||braceCount>0)){
//						return false;
//					}
				}
				else{
					return false;
				}
		}
		
		if(bracketCount==0 && braceCount==0 && parenCount==0){
			return true;
		}
		else{
			return false;
		}
	}
}


