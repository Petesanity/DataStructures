package stackArray;

public class useStack {

	public static void main(String[] args) {
		
		Stack stack = new Stack(10);
		
		stack.push(12);
		stack.push(19);
		stack.push(13);
		
		System.out.println("Top of the stack is " + stack.top());
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("Is the stack empty? " + stack.isEmpty());

	}

}
