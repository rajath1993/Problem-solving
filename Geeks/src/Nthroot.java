
public class Nthroot {
	static double root(double x, int n) {
	
    double low = 0.0;
    double high = x;
    
    
    while(Math.abs(low-high)>=0.001){
      double mid = (low+high/2.0);
      if(Math.pow(mid,n)==x)
        return mid;
      else if(Math.pow(mid,n)<x)
        high = mid;
      else if(Math.pow(mid,n)>x)
        low = mid;
    }
    
    return high;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(root(9.0,2));

	}

}
