package LinkedList;

public class Linkedlist {

	//Bad practice but I made these instance variables public for testing purposes
		public Node head;
		public Node tail;
		public Node current;
		public Node previous;
		
		public void insertBefore(int x) { //insert before current node
			if(isEmpty()) {
				head = new Node(null, x);
				tail = head;
				current = head;
			}
			else if(head == current) {
				head= new Node(head , x);
				current = head;
			}
			else {
				previous.next = new Node(current, x);
				current = previous.next;
				
			}
		}
		public void insertAfter(int x) {//insert after current node
			
			if(isEmpty()) {
				
				head  = new Node(null , x);
				current = head;
				tail = head;
				
			}
					 
			else if(current == tail) {
				
				current.next = new Node(current.next, x);
				previous = current;
				current = current.next;
				tail = current;
			
				
			}
			else {
				current.next = new Node(current.next ,x);
				previous = current;
				current = current.next;
			}
		}
		//if the list is empty
		public boolean isEmpty() {
			
			return head == null && current == null && tail == null;
		}
}
