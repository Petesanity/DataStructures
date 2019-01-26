package heap;
import java.util.Arrays;


public class useHeap {
	
	public static void main(String [] args) {
		int [] arr = {52,77,23,622,330,420,1738};
			
		System.out.println("Original" + Arrays.toString(arr));
			
		Heap heap = new Heap();
			
		System.out.println("Sorted" + Arrays.toString(heap.sort(arr)));
		
	}


}
