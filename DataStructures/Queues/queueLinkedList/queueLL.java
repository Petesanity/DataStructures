package queueLinkedList;

public class queueLL {
	
	Node front = null;
	Node back = null;
	
	public void enqueue(int item) {
		back.next = new Node(item, null); //creates a new node and inserts item into the Node and points to null
										  // back.next is the reference to this node
										
		back = back.next;  //back points to back.next
	}
	public void dequeue() { //removes node from the front by pointing to the next node
		front = front.next;
	}
	public boolean isEmpty() {
		return front ==null;
	}
	public int front() { //returns value of node that front holds reference to
		return front.x;
	}
	public int back() { //returns value of node that back holds reference to
		return back.x;
	}

}
