package codingInterviewGuide.bat;

import java.util.Arrays;

public class ThreeColor {

	
	public void sortThreeColor(int[] A, int n) {		
		sort(A, 0, n-1);
		
	}
	
	public void sort(int[] A, int lo, int hi) {
		if(lo>=hi) return;
		int val = A[lo];
		int lt = lo;
		int i = lo+1;
		int gt = hi;
		while(i <= gt) {
			int cmp = A[i] - val;
			if(cmp < 0) {
				swap(A, lt++, i++);
			}else if(cmp>0) {
				swap(A, i, gt--);
			}else {
				i++;
			}
		}		
		sort(A, lo, lt-1);
		sort(A, gt+1, hi);		
	}
	
	public void swap(int[] A, int i, int j) {
		int tp = A[i];
		A[i] = A[j];
		A[j] = tp;
		return;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,1,1,0,2,2};
		ThreeColor threeColor = new ThreeColor();
		threeColor.sortThreeColor(A, A.length);
		
		System.out.println(Arrays.toString(A));
	}

}
