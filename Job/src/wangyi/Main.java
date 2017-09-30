package wangyi;

import java.util.Arrays;
import java.util.Scanner;




public class Main {
	
	
	
	public static int[] minStep(int[] x, int[] y,  int n, int minx, int maxx, int miny, int maxy) {
		int[] res = new int[n];
		res[0] = 0;
		int len1 = maxx-minx+1;
		int len2 = maxy - miny +1;
		int[][][] distSet = new int[len1][len2][n];
		
		for(int i=minx; i<=maxx; i++) {
			for(int j=miny; j<=maxy; j++) {
				for(int k=0; k< n; k++) {
					distSet[i-minx][j-miny][k] =  dist(i, j, x[k], y[k]);
				}
//				System.out.println(Arrays.toString(distSet[i-minx][j-miny]));
				Arrays.sort(distSet[i-minx][j-miny]);
//				System.out.println(Arrays.toString(distSet[i-minx][j-miny]));
			}			
		}
//		System.out.println(minx+ ", " + maxx + ", " + miny + "," + maxy);
		for(int k=1; k<n; k++) {
			int min = Integer.MAX_VALUE;
			for(int i=minx; i<=maxx; i++) {
				for(int j=miny; j<=maxy; j++) {
					int t = 0;
					for(int m =0; m<=k; m++) {
						t+= distSet[i-minx][j-miny][m];
					}
//					System.out.println(t);
					if(t<min) {
						min =t;
					}
				}
			}
			res[k] = min;
		}
		
		return res;
		
	}
	
	public static int dist(int x1, int x2, int y1, int y2) {
		return Math.abs(x1-y1) + Math.abs(x2-y2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int minx = Integer.MAX_VALUE;
		int maxx = Integer.MIN_VALUE;
		int miny = Integer.MAX_VALUE;
		int maxy = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			if(x[i] < minx) minx = x[i];
			if(x[i] > maxx) maxx = x[i];
		}
		for (int i = 0; i < n; i++) {
			y[i] = in.nextInt();
			if(y[i] < miny) miny = y[i];
			if(y[i] > maxy) maxy = y[i];
		}
		
		int[] res = minStep(x,y,n, minx, maxx, miny, maxy);
		StringBuffer result = new StringBuffer();
		for(int i=0; i<n; i++) {
			result.append(res[i] + " ");
		}
		System.out.println(result.toString().trim()); 
		
	}

}
