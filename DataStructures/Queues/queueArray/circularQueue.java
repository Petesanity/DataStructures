package queueArray;

//a circular queue reuses empty indices to make last position
//connected back to the front position to make a circle
public class circularQueue {
	
	private int front = 0;
	private int back  = -1;
	int count = 0;
	private int [] array;
	
	public circularQueue(int size) {
		
		array = new int [size];
	}
	
	public void enqueue(int item) {
		count++;
		back = (back + 1 )% array.length;
		if(count>array.length) resize();
		array[back] = item;
		
	}
	public void dequeue() {
		count--;
		front = (front+1)%array.length;
	}
	public boolean isEmpty() {
		if(count<front) return true;
		return false;
	}
	public int front() {
		return array[front];
	}
	public int back() {
		return array[back];
	}
	
	public void resize() { //resize the queue
		
		int [] temp = new int [array.length * 2];
		for(int i = 0; i<array.length;i++) {
			temp [i] = array[i];
		}
		array = temp;
	}
	
	

}
