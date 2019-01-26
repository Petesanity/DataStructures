package queueArray;

public class Queue {
	
	private int front = 0;
	private int back = -1;
	private int [] array;
	
	public Queue(int size) {
		array = new int [size];
	}
	
	public void enqueue(int x) { //inserts an item from back of the queue
		
		back++;
		array[back] = x;
		
	}
	public void dequeue() { //removes an item from front of the queue
		front++;
	}
	public boolean isEmpty() { //checks if the queue is empty
		return back < front;
	}
	public int front() { //returns what is at the front of the queue
		return array[front];
	}
	public int back() { //returns what is at the back of the queue
		return array[back];
	}
	public void resize() { //resizes the queue
		int [] temp = new int [array.length * 2];
		for(int i = 0; i<array.length;i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

}
