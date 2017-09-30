package sort;

import java.util.Arrays;

public class QuickSort {

	
	public static void sort(int[] a) {
		if(a==null || a.length ==0) return ;
		int len = a.length;
//		quick(a, 0, len-1);
//		quick3way(a, 0, len-1);
		quick3partion(a, 0, len-1);
	}
	
	public static void quick3way(int[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int lt = lo;
		int i = lo+1;
		int gt = hi;
		int tp = a[lo];
		while (i <= gt) {
			int cmp = a[i] - tp;
			if(cmp >0) Utils.swap(a, i, gt--);
			else if(cmp <0) Utils.swap(a, i++, lt++);
			else i++;
		}
		quick3way(a, lo, lt-1);
		quick3way(a, gt+1, hi);
	}
	
	public static void quick3partion(int[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int len = hi-lo+1;
		
		if (len <= 40) {
			//use median
			int m = median3(a, lo, lo + len>>1, hi);
			Utils.swap(a, lo, m);
		}else {
			//use median's median
			int offset = len/8;
			int mid = lo+len>>1;
			int m1 = median3(a, lo, lo+offset, lo+offset+offset);
			int m2 = median3(a, mid -offset, mid, mid + offset);
			int m3 = median3(a, hi-offset-offset, hi-offset, hi);
			int ninther = median3(a, m1, m2, m3);
			Utils.swap(a, lo, ninther);
		}
		
		int j = partion(a, lo, hi);
		quick(a, lo, j-1);
		quick(a, j+1, hi);
	}
	
	public static void quick(int[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int j = partion(a, lo, hi);
		quick(a, lo, j-1);
		quick(a, j+1, hi);
	}
	
	public static int partion(int[] a, int lo, int hi) {
		int tp = a[lo];
		int i = lo, j = hi+1;
		while (true) {
			while(a[++i] <= tp) if(i==hi) break;
			while(a[--j] >= tp) if(j==lo) break;
			if(i>=j) break;
			else{
				Utils.swap(a, i, j);
			}
		}
		Utils.swap(a, lo, j);
		return j;
	}
	
	
	public static int median3(int[] a, int i, int j, int k){
		return (a[i] < a[j]?
				(a[j] < a[k]? j : a[i] < a[k]? k : i):
				(a[i] < a[k]? i : a[j] < a[k]? k : j));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
