package didi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Bean{
	int l, r;
	public Bean(int l, int r) {
		// TODO Auto-generated constructor stub
		this.l = l;
		this.r = r;
	}
	
	
}

public class Main2 {

	static int res = 0;
	
	
	
	public static void getMax(int n, int[] a) {
		
		ArrayList<Bean> all = new ArrayList<>();
		
		int[][] dp = new int[n][n];
		dp[0][0] = a[0];
		
		for(int i=1; i<n; i++) {
			dp[0][i] = dp[0][i-1]^a[i];
		}
		for(int i=1; i<n; i++) {
			for(int j=i; j<n; j++) {
				dp[i][j] = dp[i-1][j]^a[i-1];
				if(dp[i][j]==0) {
					all.add(new Bean(i, j));
				}
			}			
		}
		Collections.sort(all, new Comparator<Bean>() {
			
			public int compare(Bean o1, Bean o2) {
				// TODO Auto-generated method stub
				return o1.l - o2.l;
			}
		});
		 res = 0;
		int cur=-1;
		for(Bean bean: all) {
			if(bean.l>cur) {
				res++;
				cur = bean.r;
			}
		}
//		return res
//		next(dp, n, 0, 0);		
	}
	
	
	public static void next(int[][] dp, int n, int i, int pre) {
		if(i==n) {
			res = Math.max(res, pre);
		}
		int j=i;
		for(j=i; j<n; j++) {
			if(dp[i][j]==0) {
				next(dp, n, j+1, pre+1);
//				return;
			}
		}
		if(j==n) next(dp, n, i+1, pre);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		getMax(n, a);
		System.out.println(res);
	}

}
