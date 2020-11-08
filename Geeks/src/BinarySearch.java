
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{1,2,3,5,6,7};
		int num = 5;
		
		boolean yes = findNum(a,num);
		
		System.out.println(yes);
	}
	/*finding key item using binary search*/
	static boolean findNum(int[] a,int n) {
		int beg = 0;
		int end = a.length - 1;
		int mid = 0;
		while(beg<=end) {
			mid = beg + (end-beg)/2;
			System.out.println(mid);
			if(n==a[mid]) return true;
			else if(n>a[mid]) beg = mid+1;
			else if(n<a[mid]) end = mid-1;
		}
		
		
		return false;
	}

}
