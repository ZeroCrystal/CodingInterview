package yixin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		/*
		long[] dp = new long[w];
		int mod = 100003;
		if(n==1) {
			System.out.println(n%mod);
			return;
		}
		if(n==2) {
			System.out.println(((long)n*(n-1))%mod);
			return;
		}
		dp[0] = 1;
		dp[1] = n;
		dp[2] = n*(n-1);
		for(int i=3; i<w; i++) {
			dp[i] = dp[i-1]*n - dp[i-2];
		}
		
		System.out.println(dp[w-1]%mod);
		*/
		
		int _mod = 100003;
		long res = n%_mod, ans = 0;
		for (int i = 1; i < w; i++)
		{
			ans = (ans*n + res) % _mod;
			res = (res * (n - 1)) % _mod;
		}
		System.out.println(ans);
		
		
//		long res = n % mod;
//		for (int i = 1; i < w; i++)
//			res = (res * (n - 1)) % mod;
////			cout << res << endl;
		
//		System.out.println(res);

	}

}
