package baidu;

import java.util.Scanner;

public class Main2 {

	static int max = Integer.MIN_VALUE;
	
	public static void maxHeight(int[][] A, int[][] p, int m, int n, int x, int y) {
		if(A[x][y] > max) max = A[x][y];
		p[x][y] = 1;
		if(x-1 >=0 && A[x-1][y]>= A[x][y] && p[x-1][y]==0) maxHeight(A, p, m, n, x-1, y);
		if(x+1 <m && A[x+1][y]>= A[x][y] && p[x+1][y]==0) maxHeight(A, p, m, n, x+1, y);
		if(y-1 >=0 && A[x][y-1]>= A[x][y] && p[x][y-1]==0) maxHeight(A, p, m, n, x, y-1);
		if(y+1 <n && A[x][y+1]>= A[x][y] && p[x][y+1]==0) maxHeight(A, p, m, n, x, y+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int x = in.nextInt()-1;
		int y = in.nextInt()-1;
		int[][] A = new int[m][n];
		int[][] p = new int[m][n];
		for(int i=0 ; i< m; i++) {
			for(int j=0; j<n; j++) {
				A[i][j] = in.nextInt();
			}
		}
		in.close();
		maxHeight(A, p, m, n, x, y);
		System.out.println(max);

	}

}
