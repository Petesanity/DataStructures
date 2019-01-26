package heap;

public class Heap {
	
	private final int root = 0;
	
	public int [] value ;//array
	public int last = -1; //keep track of the last
	
	public int [] sort(int [] x) {
		value = x;
		
		for(int i = 0; i<value.length; i++) {
			insert();
		}
		
		for(int j = 0; j<value.length;j++) {
			remove();
		}
		return value;
	}
	public void insert() {
		last++;
		heapifyUpwards(last);
	}
	public void remove() {
		swap(root, last);
		last--;
		heapifyDownwards(root);
	}
	private void swap(int A, int B) {
		int temp = value[A];
		value[A] = value [B];
		value[B] = temp;
	}
	private void heapifyUpwards(int node) {
		if(!(node<=root) && (value[node]>value[parent(node)])){
			swap(node, parent(node));
			heapifyUpwards(parent(node));
		}
	}
	//if we have a right node and its the
	//bigger child of the 2 and bigger than
	//root node
	private void heapifyDownwards(int node) {
		if((right(node)<=last) &&
				((value[right(node)]) > value[left(node)])) {
			if(value[right(node)] > value[node]) { 
			
				swap(right(node),node);
				heapifyDownwards(right(node)); //send the info to right node and check
			
			}
		}
		//if theres no right node and its not big enough
		else {
			if(left(node)<=last) {
				if(value[left(node)] > value[node]) {
					swap(left(node),node);
					heapifyDownwards(left(node));
				}
			}
		}
	}
	private int left(int n) {
		return (2*n) + 1;
	}
	private int right(int n) {
		return (2*n) + 2;
	}
	private int parent(int n) {
		return (n-1)/2;
	}

}


