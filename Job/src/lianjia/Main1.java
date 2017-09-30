package lianjia;

import java.util.Arrays;

public class Main1 {
		public int  sort(int[] A, int n) {
			int res = 0;
			int lt = -1;
			int start = 0;
			for(int cur = 1; cur <4; cur++) {				
				start = lt+1;
				if(A[start]==cur) lt = start;
				for(int i=start ; i<n; i++) {
					if(A[i] == cur) {
						if(i-lt>1) {
							swap(A, i, ++lt);
							res++;
						}else {
							lt++;
						}
					}
				}
			}
			return res;
		}
		
		
		public void swap(int[] A, int i, int j) {
			int tp = A[i];
			A[i] = A[j];
			A[j] = tp;
			
			return;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] A = {2,2,1,3,3,3,2,3,1};
			Main1 solu = new Main1();
			System.out.println(solu.sort(A, A.length));
		}

	

}
