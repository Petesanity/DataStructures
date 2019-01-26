package stackArray;

public class StackString {
	
	private String [] array; //array declaration
	private int top = -1;
	
	public StackString(int size) {
		array = new String [size]; //array initialization
	}
	public void push(String item) { //inserts an item onto the top of the stack
		top++;
		array[top] = item;
	}
	public void pop() { //removes an item from top of the stack
		top--;
	}
	public String top() { //returns what is on top of the stack
		return array[top];
	}
	public boolean isEmpty() {//checks if the stack is empty
		return top == -1;
	}
	public void resize() { //increases the size of stack
		
		String [] temp = new String [array.length *2];
		for(int i = 0; i< array.length;i++) {
			temp[i] = array[i];
		}
		array = temp;
		
	}


}
