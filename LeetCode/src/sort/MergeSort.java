package sort;

import java.util.Arrays;

public class MergeSort {

	
	static int[] aux;
	
	
	public static void sort(int[] a) {
		int len = a.length;
		aux = new int[len];
//		sortDown(a, 0, len-1);
		sortUp(a);
	}
	
	public static void sortDown(int[] a, int lo, int hi) {
		if(lo >= hi) return;
		
		int mid = lo + (hi-lo)/2;
		sortDown(a, lo, mid);
		sortDown(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	public static void sortUp(int[] a) {
		int len = a.length;
		for (int sz = 1; sz < len; sz = sz*2) {
			for (int lo = 0; lo < len-sz; lo+=sz*2) {
				merge(a, lo, lo+sz-1, Math.min(len-1, lo+sz+sz-1));
			}
		}
	}
	
	public static void merge(int[] a, int lo, int mid, int hi) {
		if(lo > hi) return;
		int i = lo;
		int j = mid+1;
		for (int k = lo; k <=hi; k++) {
			aux[k] = a[k];
		}
		
		for (int k = lo; k <=hi; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if(a[i] < a[j]) a[k] = aux[i++];
			else a[k] = aux[j++];
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
