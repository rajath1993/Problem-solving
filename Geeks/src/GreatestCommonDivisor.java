
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a, int b) {
		int res = Math.min(a, b);
		while(res!=0) {
			if(a%res==0 && b%res==0) {
				break;
			}
			else {
				res--;
			}
		}
		return res;
	}

}
/*Time complexity: O(min(a,b))*/