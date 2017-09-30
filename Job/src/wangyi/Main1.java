package wangyi;

import java.util.Arrays;
import java.util.Scanner;


public class Main1 {

	private static long factorial(int n) {  
	    return (n > 1) ? n * factorial(n - 1) : 1;  
	} 
	
	public static long combination(int n, int m) {  
	    return (n >= m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;  
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = s;
		int[] tp = new int[3];
		tp[0] = sc.nextInt();
		tp[1] = sc.nextInt();
		tp[2] = sc.nextInt();
		
		sc.close();
		
		long res = 0;
		Arrays.sort(tp);
		int sum = tp[0] + tp[1] + tp[2];
//		System.out.println(Arrays.toString(tp));
		
	
		if(sum > n) {
			for(int a = tp[2]; a>=0; a--) {				
				s = n;
				if(a > s) continue;
				long cur = 0;
				long cnt = combination(s, a)*combination(n-a, tp[2]-a);
				s -= a;
				for(int b = tp[1]; b>=0; b--) {
					if (b > s || tp[0]< (s-b) ) continue;					
					cur = cnt* combination(s, b)*combination(s-b, tp[1]-b);
					if(tp[0] > s-b) cur*=combination(n, tp[0]-s-b);
					res+= cur%1000000007;
					res = res%1000000007;
//					System.out.println(a+ ", " + b + ", "  +s+", " + res);
				}
//				res += cur;			
			}			
			
		}else {
			res = combination(s, tp[0])*combination(s-tp[0], tp[1]);
		}

		
		/*
		int i=2;
		while (s!=0&&i>=0) {
			if(tp[i]> s) {
				break;
			}else {
				res *= combination(s, tp[i]);
				s -= tp[i];
				i--;
//				res = res%1000000007;
//				System.out.println(s + "," + i);
			}
		}
		if(i>=0) {
			res *= combination(n-s, tp[i]-s);
			while(i>=0) res *= combination(n, tp[i--]);
		}
		*/
		
		
		System.out.println(res%1000000007);
		
	}

}
