import java.util.*;
public class HeapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,-1};
		implementPQ(a);
	}
	
	public static void implementPQ(int[] a) {
		int n = a.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>(n,(x,y) -> a[x]-a[y]);
		
		for(int i=0;i<a.length;i++) {
			pq.add(i);
		}
		
		while(pq.size()!=0) {
			System.out.println(pq.poll());
		}
		System.out.println('0');
	}

}
