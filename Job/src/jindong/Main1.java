package jindong;

public class Main1 {

	
	public static int getNum(int n) {
		if(n<=1) return n;
		
//		int k = (int)Math.sqrt(n*8);
		int k = (int)(Math.sqrt(1+8*n)-1)/2;
		int cur = k*(k+1)/2;        
		if(cur<n) {
//			int t = n - cur;
//			int m = (int)Math.sqrt(t*2);
//			cur += (2*k+1+m)*m/2;
			cur += k++;
//			k+=m;
		}   				
		
		return k;
		
	}
	     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNum(169));
	}

}
