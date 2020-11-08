import java.util.PriorityQueue;

public class PurchaseMax {
	
	static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	//PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)->(y-x));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20,10,5,30,100};
		int sum = 35;
		findMaxPurchase(a,sum);

	}
	
	public static void findMaxPurchase(int[] a,int sum) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			minHeap.add(a[i]);
		}
		
		while(sum>0) {
			count++;
			sum-=minHeap.poll();
		}
		
		System.out.println(count);
	}

}
