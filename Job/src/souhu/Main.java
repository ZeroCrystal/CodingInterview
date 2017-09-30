package souhu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	

		
		
		public static void main2(String[] args) {
			// TODO Auto-generated method stub
			Scanner in  = new Scanner(System.in);
			
			while(in.hasNext()) {
				int L = in.nextInt();
				int[] a = new int[L];
				for(int i=0; i<L; i++) {
					a[i] = in.nextInt();
				}
				long[][] dp = new long[L][L];
	            for(int i=0; i<L; i++) {
					dp[i][i] = a[i];
				}
				for(int i=L-2; i>=0; i--) {
					for(int j=i+1; j<L; j++) {
						if(a[i]==a[j]) dp[i][j] = dp[i+1][j-1]+2*a[i];
						else {
							dp[i][j] = Math.min(dp[i+1][j]+2*a[i], dp[i][j-1]+2*a[j]);
						}
					}
				}
				System.out.println(dp[0][L-1]);
			}
			
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i=0; i< n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long[][] dp = new long[n][n];
        for(int i=0; i<n; i++) {
			dp[i][i] = a[i];
		}
		for(int i=n-2; i>=0; i--) {
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) {
					dp[i][j] = dp[i+1][j-1]+2*a[i];
				}else {
					dp[i][j] = Math.min(dp[i+1][j]+2*a[i], dp[i][j-1]+2*a[j]);
				}
			}
		}
		System.out.println(dp[0][n-1]);
		
		
	}	
		
		
		
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i=0; i< n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		for(int i=n-1; i>=0; i-- ) {
			b[n-1-i] = a[i];
		}
		
		long[][] dp = new long[n+1][n+1];
		for (int i = 0; i < dp.length; i++) {  
            dp[i][0] = 0;  
        }  
        for (int i = 0; i < dp[0].length; i++) {  
            dp[0][i] = 0;  
        }  
        
        
        
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= n; j++) {  
                if (a[i - 1] == b[j - 1]) {  
                    dp[i][j] = dp[i - 1][j - 1] + 1;  
                } else {  
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);  
                }  
            }  
        }   
        
        for(int i=0; i<=n; i++) {
        	System.out.println(Arrays.toString(dp[i]));
        }
        
        long res = 0;
        long pre = 0;
        for(int i=1; i<=n; i++) {
        	if(dp[i][i] == pre) {
        		res += a[i-1] + b[i-1];
        	}else {
        		res += a[i-1];
        	}
        	pre = dp[i][i];
        }
        System.out.println(res);
        
//        System.out.println(n-dp[n][n]);  
        
	}

}
