package array;

import java.util.Arrays;


public class MinK {

	public static int[] getMinK(int[] a, int k) {
		if(a==null) return null;
		if(k < 1 || k > a.length){
			return a;
		}
		int minK = getMinKByBFPRT(a, k);
		int[] res = new int[k];
		int idx=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minK) {
				res[idx++] = a[i];
			}
		}
		for (; idx < k; idx++) {
			res[idx] = minK;
		}
		return res;
	}
	
	
	
	private static int getMinKByBFPRT(int[] a, int k) {
		// TODO Auto-generated method stub
		int[] copyArr = copyArray(a);

		return select(copyArr, 0, a.length-1, k-1);
	}
	
	public static int select(int[] a, int begin, int end, int k) {
//		System.out.println(begin + " " + end);
		if (begin==end) {
			return a[begin];
		}
		
		int pivot = medianOfMedian(a, begin, end);
		int[] range = partition(a, begin, end, pivot);
		if (k >= range[0] && k <= range[1]) {
			return a[k];
		}else if (k < range[0]) {
			return select(a, begin, range[0]-1, k);
		}else {
			return select(a, range[1]+1, end, k);
		}
	}

	


	private static int[] partition(int[] a, int begin, int end, int pivot) {
		// TODO Auto-generated method stub
		int small = begin-1;
		int cur = begin;
		int large = end+1;
		while (cur!=large) {
			if (a[cur] < pivot) {
				swap(a, cur++, ++small);
			}else if (a[cur] >  pivot) {
				swap(a, cur, --large);
			}else {
				cur++;
			}
		}
		int[] range = new int[2];
		range[0] = small+1;
		range[1] = large-1;
		return range;
	}

	

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int tp = a[i];
		a[i] = a[j];
		a[j] = tp;
	}



	private static int medianOfMedian(int[] a, int begin, int end) {
		// TODO Auto-generated method stub
		int num = end-begin +1;
		int offset = num%5==0?0:1;
		int[] median = new int[num/5+offset];
		int lo ;
		int hi;
//		System.out.println(Arrays.toString(a) + " " + begin + " " + end);
		for (int i = 0; i < median.length; i++) {
			 lo = begin + i*5;
			 hi = lo + 4;
			 median[i] = getMedain(a, lo, Math.min(hi, end));
		}
		return select(median, 0	, median.length-1, median.length/2);
	}



	private static int getMedain(int[] a, int lo, int hi) {
		// TODO Auto-generated method stub
		insertSort(a, lo, hi);
		int num = lo +hi;
		int idx = num/2 + num%2;
		return a[idx];
	}

	
	private static void insertSort(int[] a, int lo, int hi) {
//		System.out.println("sort: "+ lo + ", " + hi);
//		System.out.println(Arrays.toString(a));
		// TODO Auto-generated method stub
		for (int i = lo+1; i <= hi; i++) {
			for (int j =i; j >lo &&a[j] < a[j-1]; j--) {
				swap(a, j, j-1);
			}
		}
		
	}



	private static int[] copyArray(int[] a) {
		// TODO Auto-generated method stub
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = a[i];
		}
		
		return res;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11,2,3,4,5,6,7,8,9,10};
		int[] res = getMinK(a, 5);
		System.out.println(Arrays.toString(res));
	}

}
