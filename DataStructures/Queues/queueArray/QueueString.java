package queueArray;

public class QueueString {

	private int front = 0;
	private int back = -1;
	private String [] array;
	
	public QueueString(int size) {
		array = new String [size];
	}
	
	public void enqueue(String  x) { //inserts an item from back of the queue
		
		back++;
		array[back] = x;
		
	}
	public void dequeue() { //removes an item from front of the queue
		front++;
	}
	public boolean isEmpty() { //checks if the queue is empty
		return back< front;
	}
	public String front() { //returns what is at the front of the queue
		return array[front];
	}
	public String back() { //returns what is at the back of the queue
		return array[back];
	}
	public void resize() { //resizes the queue
		String [] temp = new String [array.length * 2];
		for(int i = 0; i<array.length;i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

}
