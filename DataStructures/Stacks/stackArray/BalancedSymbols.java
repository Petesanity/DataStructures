package stackArray;

public class BalancedSymbols {
	
	//checks if parentheses,brackets and braces are balanced
	public static boolean isBalanced(String symbols) {
		
		Stackchar stack = new Stackchar(10);
		
		for(int i = 0; i<symbols.length();i++) {
			char ch = symbols.charAt(i);
			
			if((ch=='{') || (ch=='[') || (ch=='(')) stack.push(ch); //push opening symbols to stack
			else if((ch=='}') || (ch==']') || (ch==')')) {
				 if((isPair(stack.top(),ch))) stack.pop(); //if they make a pair remove from stack
				 else {
					 return false;
				 }
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		else return false;
		
	}
	public static boolean isPair(char ch, char ch2) { //checks if opening and closing symbols are correlated to each other
		if((ch == '(') &&(ch2==')')) return true;
		if((ch == '[') &&(ch2==']')) return true;
		if((ch == '{') &&(ch2=='}')) return true;
		
		return false;
		
	}
	public static void main(String [] args) {
		String str = "{}()[]";
		System.out.println("are these symbols balanced? " + isBalanced(str));
	}

}
