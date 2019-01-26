package BinarySearchTree;

public class useBST {

	public static void main(String[] args) {
		BST bst = new BST();
			
		int [] A = {79,21,18,22,66,50,69,121,1,400,1021,1024,1738};
			
		for(int i = 0; i<A.length;i++) {
			bst.insert(A[i]);
		}
		System.out.println("height of tree : " + bst.height());
		System.out.println("total number of nodes : " + bst.count());
		System.out.println("max node : " + bst.max());
		System.out.println("min node : " + bst.min());
		
		System.out.println("Sorted Order :");
		bst.printInOrder();
	}
}

