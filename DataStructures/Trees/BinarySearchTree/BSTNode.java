package BinarySearchTree;

public class BSTNode {
	
	BSTNode left = null; //left node
	BSTNode right = null; //right node
	int x; // value inside BSTNode
	
	int [] A ; //array for inOrder function
	int val = 0; //value used for array
	
	
	BSTNode(int x){
		this.x = x;
	}
	public void printInOrder() { //prints all values in BST in ascending order
		if(left!=null) left.printInOrder();
		System.out.print(x + " ");
		if(right!=null)right.printInOrder();
	}

	public void inOrder() { //placing values of BST in array in ascending order
		
		if(left!=null) left.inOrder();
		
		A = new int [count()];
		val= 0;
		A[val++] = x;
		
		if(right!=null) right.inOrder();
		
	}
	
	public void insert(int data) { //inserting in a BST
		if(data<x) {
			if(left!=null)left.insert(data);
			else {
				left = new BSTNode(data);
			}
		}
		if(data>x) {
			if(right!=null)right.insert(data);
			else {
				right = new BSTNode(data);
			}
		}
	}
	public int height() { //finding height of a BST
		
		int leftH = 0;
		int rightH = 0;
		
		if(left!= null) leftH = left.height();
		if(right!=null) rightH = right.height();
		
		return Math.max(leftH, rightH) + 1;
		
	}
	
	public int max() { //finding max in a BST
		
		if(right!=null) return right.max();
		else return x;
		
	}
	
	public int min() {//finding min in a BST
		
		if(left!=null) return left.min();
		else return x;
	}
	
	public int count() { //get total number of nodes in the BST
	
		int leftCount = 0;
		int rightCount = 0;
		if(left!=null) leftCount+=left.count();
		if(right!=null) rightCount+=right.count();
		
		return leftCount + rightCount + 1;
		
	}
	
	public int search(int data) { //search BST for value
		if(data == x) return x;
		
		else if(data<x && left!=null)return left.search(data);
		
		else if(data>x && right!=null) return right.search(data);
		
		return -1;
	}
	
	public BSTNode searchNode(int data) { //search BST for NODE with value 
		
		if(x == data) return this;
		
		if(data<x && left!=null) return left.searchNode(data);
		if(data>x && right!=null) return right.searchNode(data);
		
		return null;
	}
	

}
