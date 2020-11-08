
public class ReverseAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 196;
		
		long result = reverseAndAdd(num);
		
		System.out.println(result);
	}
	
	public static long reverseAndAdd(int num) {
		long sum = num;
		int flag = 0;
		int count = 0;
		while(sum<=4294967295L || count>999) {
			sum+=reverse(sum);
			if(checkPalindrome(sum)==true) {
				flag = 1;
				return sum;
			}
			count++;
		}	
		if(flag==0) System.out.println("No Palindrome");
		return 0;
	}
	
	public static boolean checkPalindrome(long num) {
		if(reverse(num)==num) {
			return true;
		}
		return false;
	}
	public static long reverse(long num) {
		long temp = 0;
		while(num!=0) {
			temp = (temp * 10) + (num%10);
			num = num/10;
		}
		
		return temp;
	}

}
