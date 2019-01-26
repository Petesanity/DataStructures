package stackLinkedList;

public class stackLL {
	
	private Node top = null; 
	
	public void push(int item) { //creates a new node with value of item and a reference to top as next node then
								 //top points to this new node
		
		top = new Node(top,item);
	}
	public void pop() { //top becomes a reference to the next node
		top = top.next;
	}
	
	public boolean isEmpty() { //checks if stack is empty
		return top == null;
	}
	public int top() { //returns value of the node currently at top
		return top.x;
	}
	
	

}
