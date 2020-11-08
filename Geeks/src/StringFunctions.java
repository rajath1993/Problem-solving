import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		String s = "95afg";
		String exp1 = "+";
		String exp2 = "-";
		String exp3 = "*";
		findSolution(s,exp1,exp2,exp3);
	}
	
	public static void findSolution(String s,String exp1,String exp2,String exp3) {
		String[] str = s.split(",");
		System.out.println(str[0]);
		int count = 0;
		int result = 0;
		for(int i=0;i<str.length;i++) {
			String st = str[i];
			for(char ch:st.toCharArray()) {
				if(Character.isDigit(ch)) {
					count+=1;
					if(count==1) {
						result = add(ch,result);
					}
					else if(count == 2) {
						result = mul(ch,result);
					}
					else if(count ==3) {
						result = sub(ch,result);
					}
				}				
			}
			count=0;

		}
		System.out.println(result);
	}
	
	public static int add(char ch,int res) {
		res+=Character.getNumericValue(ch);
		return res;
	}
	
	public static int mul(char ch,int res) {
		res*=Character.getNumericValue(ch);
		return res;
	}
	
	public static int sub(char ch,int res) {
		res-=Character.getNumericValue(ch);
		return res;
	}

}
