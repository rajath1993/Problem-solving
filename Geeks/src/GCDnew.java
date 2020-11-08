
public class GCDnew {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		
		int gcd = gcd(a,b);
		int lcm = (a*b)/gcd;
		
		System.out.println(lcm);

	}
	
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		
		return gcd(b,a%b);
	}

}
