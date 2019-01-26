package queueArray;

public class useCircularQueue {

	public static void main(String[] args) {

		circularQueue queue = new circularQueue(3);
	
		queue.enqueue(23);
		queue.enqueue(34);
		queue.enqueue(13);
		
		System.out.println("front is " + queue.front());
		System.out.println("back is " + queue.back());
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		System.out.println("is it empty? " + queue.isEmpty());
	
	}
}
