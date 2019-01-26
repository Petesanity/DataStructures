package stackArray;

public class PostfixEvaluator {
	
	//evaluating postfix expression
	public static int postfixEval(String postfix) {
		
		Stack stack = new Stack(postfix.length()/2+1);//pushing operands to the stack
		
		
		for(int i = 0; i<postfix.length();i++) {
			char ch = postfix.charAt(i);
			/*when an operator is reached perform the necessary operations after popping 
			 * the operands from the stack then push the result
			 */
			if(isOperator(ch)) {
				int b = stack.top(); 
				stack.pop();
				int a = stack.top();
				stack.pop();
				if(ch == '+') stack.push(a+b); //if character is plus,perform addition
				if(ch== '-') stack.push(a-b); //if character is minus, perform subtraction
				if(ch == '*') stack.push(a*b); //if character is multiplication sign, perform multiplication
				if(ch== '/') stack.push(a/b); //if character is division sign, perform division
			}
			else {
				stack.push(ch - '0');
			}
		}
		return stack.top();
	}
	public static boolean isOperator(char ch) { //check is character is an operator
		
		return (ch == '+') || (ch =='-') || (ch == '*') || (ch == '/');
		
	}
	public static void main(String [] args) {
		
		String postfix = "235*+";
		System.out.println("The evaluated postfix is " + postfixEval(postfix));
	}

}
