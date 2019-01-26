package stackArray;

public class InfixEvaluator {
	
	//converting infix expression to postfix expression
	public static String infix2Postfix(String infix) {
		
		infix = "(" + infix + ")";
		
		String postfix = "";
		
		Stackchar stack = new Stackchar(infix.length()/2); //only pushing operators onto the stack
		
		for(int i = 0; i<infix.length();i++) {
			char ch = infix.charAt(i);
			if(isOperator(ch)) { 
				while(!stack.isEmpty() && prec(ch)<=prec(stack.top())) {
					postfix += stack.top();
					stack.pop();
				}
				stack.push(ch);
			}
			else if(ch == '(') stack.push(ch);
			else if(ch == ')') {
				while(stack.top()!= '(') { 
					postfix+= stack.top();
					stack.pop();
				}
				stack.pop();
			}
			else {
				postfix+=ch;
			}
		}
		return postfix;
		
	}
	public static boolean isOperator(char ch) { //checks if character is an operator
		return (ch == '+') || (ch=='-') || (ch=='*') ||(ch=='/');
	}
	public static int prec(char ch) { //checks the order of precedence for operators as they appear
		if(ch == '^') return 3;
		if((ch == '*') || (ch =='/')) return 2;
		if((ch == '+') || (ch == '-')) return 1;
		
		return 0;
		
	}
	
	public static void main(String [] args) {
		
		String postfix = infix2Postfix("2+3*5");
		
		System.out.println(postfix); 
		
	}
	

}
