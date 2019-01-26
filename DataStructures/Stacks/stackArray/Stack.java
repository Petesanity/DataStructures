package stackArray;

public class Stack {
	
	private int [] array; //array declaration
	private int top = -1;
	
	public Stack(int size) {
		array = new int [size]; //array initialization
	}
	public void push(int item) { //inserts an item onto the top of the stack
		top++;
		array[top] = item;
	}
	public void pop() { //removes an item from top of the stack
		top--;
	}
	public int top() { //returns what is on top of the stack
		return array[top];
	}
	public boolean isEmpty() {//checks if the stack is empty
		return top == -1;
	}
	public void resize() { //increases the size of stack
		
		int [] temp = new int [array.length *2];
		for(int i = 0; i< array.length;i++) {
			temp[i] = array[i];
		}
		array = temp;
		
	}

		
}
