import java.util.ArrayList;
import java.util.Arrays;

public class Pascals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		printPascal(n);
		printPascal2(n);
	}
	
	/*powers of 11 -> works only for first 5 lines
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * */
	public static void printPascal(int n) {
		ArrayList<Integer> res = new ArrayList<>();
		int count = 0;
		while(count<n) {
			int power = (int) pow(count);
			res.add(power);
			count++;
		}
		
		System.out.println(res);
	}
	
	public static double pow(int n) {
		double pow = Math.pow(11, n);
		return pow;
	}
	
	
	/*2nd approach -> nCr = nCr-1 * (n-r+1)/r 
	 * Time Complexity: O(n*2)
	 * Space Complexity: O(n)*/
	public static void printPascal2(int n) {
		String res = "";
		for(int i=0;i<n;i++) {
			int C = 1;
			res+=C;
			for(int j=1;j<=i;j++) {
				C = C * (i-j+1)/j;
				res+=C;
				
			}
			res+=",";
		}
		res = res.substring(0, res.length()-1);
		System.out.println(res);
	}

}
