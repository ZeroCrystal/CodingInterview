package offer;

import java.util.Arrays;

public class Combination {

	public void runCombination(int[] a, int n) {
		if(a==null|| a.length==0|| n>a.length)
			return;
		Arrays.sort(a);
		int[] b = new int[n];
//		getAllCombination(a, n, 0, b, 0);
		getAllCombinationDup(a, n, 0, b, 0);
	}
	
	public void getAllCombinationDup(int[] a, int n, int start, int[] b, int idx) {
		if (n==0) {
			System.out.println(Arrays.toString(b));
			return;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (idx==0 || a[i] >= b[idx-1] ) {
				b[idx] = a[i];
				getAllCombinationDup(a, n-1, i+1, b, idx+1);
			}
		}
	}
	
	public void getAllCombination(int[] a, int n, int start, int[] b, int idx) {
		if(n==0) {
//			for(int i = 0; i<idx; i++) {
//				System.out.print(b[i] + ",");
//			}
//			System.out.print("\n");
			System.out.println(Arrays.toString(b));
			return;
		}
		for (int i = start; i < a.length; i++) {
			b[idx] = a[i];
			getAllCombination(a, n-1, i+1, b, idx+1);
		}
	}
	
	
	public void combine(int m, int n) {
		if (m <1 || n <1) {
			 return;
		}
		if (n > m) {
			n = m;
		}
		
		boolean[] b = new boolean[n+1];
		getCombine(b, n, m);
	}
	
	
	private void getCombine(boolean[] b, int n, int m) {
		// TODO Auto-generated method stub
		if(n < 1 || m < 1) {
			return ;
		}
		if(n==m) {
			//out put the result
			b[n] = true;
			for(int j=1; j < b.length; j++) {
				if(b[j]) {
					System.out.print(j + " ");
				}
			}
			System.out.print("\n");
			b[n] = false;
		}
		
		b[n] = true;
		getCombine(b, n-1, m-n);
		b[n] = false;
		getCombine(b, n-1, m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination comb = new Combination();
		int[] a = {1,2,3,4};
//		comb.runCombination(a, 2);
		comb.combine(5, 4);
	}

}
