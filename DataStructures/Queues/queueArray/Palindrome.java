package queueArray;
import stackArray.StackString; 

public class Palindrome {
	
	//checking if a string is a palindrome using a Stack and Queue
	public static boolean isPalindrome(String str) {
		
		StackString stack = new StackString(str.length()); //declaring a stack
		QueueString queue = new QueueString(str.length()); //declaring a queue
		
		for(int i = 0; i<str.length();i++) {
			String str2 = " " + str.charAt(i);
			stack.push(str2); //push characters of the string to the stack
			queue.enqueue(str2); //enqueue characters of the string to the queue
		}
		//checks if both stack and queue are not empty and if whats on top of stack is equal to front of queue
		while(((!stack.isEmpty()) && (!queue.isEmpty())) && (stack.top().equals(queue.front()))) {
				
					stack.pop(); //remove item from top of the stack
					queue.dequeue(); //remove item from front of queue
		}
		
		if((stack.isEmpty()) && (queue.isEmpty())) { //if both stack and queue are empty then they're palindromes
			return true;
		}
		else return false;
	}
	public static void main(String [] args) {
		String palindrome = "anutforajaroftuna";
		System.out.println("is this a palindrome? " + isPalindrome(palindrome));
		System.out.println("is this a palindrome? " + isPalindrome("wahw"));

	}

}
