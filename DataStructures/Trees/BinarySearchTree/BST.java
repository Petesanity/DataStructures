package BinarySearchTree;

public class BST {
	
	BSTNode root = null;
	
	int val = 0;
	
	int [] A ;
	
	public boolean isEmpty() { //check if BST is empty
		
		return root == null;
	}
	public void balance() { //balancing a BST
		
		inOrder(); //sort
		root = null; //make tree empty
		bisectionInsert(0, A.length-1);
		
		
	}
	
	public void bisectionInsert(int first, int last) {
		if(first<last) {
			int mid = (first + last)/2;
			insert(A[mid]);
			bisectionInsert(first,mid-1);
			bisectionInsert(mid+1,last);
		}
		
	}

	public void inOrder() { //placing values of BST in array in ascending order
		if(!isEmpty()) {
			A = new int[count()];
			val = 0;
			root.inOrder();
		}
		
		
	}
	
	public void printInOrder() { ////prints all values in BST in ascending order
		
		if(!isEmpty()) root.printInOrder();
		
	}
	
	public void insert(int data) { //inserting in a BST
		if(isEmpty()) root = new BSTNode(data);
		
		else root.insert(data);
	}
	
	public int height() { //finding height of a BST
		if(isEmpty()) return 0;
		else return root.height();
	}
	public int max() { //find max of a BST
		if(isEmpty()) return Integer.MAX_VALUE;
		else return root.max();
		
	}
	public int min() { //finding min of a BST
		
		if(isEmpty()) return Integer.MIN_VALUE;
		else return root.min();
	}
	public int count() { //finding total number of Nodes in a BST
		if(isEmpty()) return 0;
		else return root.count();
	}
	
	public int search(int data) { //searching for integer data in a BST
		
		if(!isEmpty()) return root.search(data);
		
		return -1;
		
	}
	public BSTNode searchNode(int data) { //searching for Node with value in BST
		if(!isEmpty()) return root.searchNode(data);
		 return null;
	}

}
