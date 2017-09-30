package codingInterviewGuide.bat;

import java.util.Arrays;

public class HeapSort {

	
	public void makeMaxHeap(int[] a, int n) {
		for(int i = n/2-1; i>=0; i--) {
			heapFixDown(a, i, n);
		}
	}
	
	public void heapFixDown(int[] a, int i, int n) {
		int val = a[i];
		int j = i*2 +1;
		while(j < n) {
			if(j+1<n &&a[j] < a[j+1]) {
				j++;
			}
			if(a[j] < val) {
				break;
			}
			a[i] = a[j];
			i = j;
			j = i*2+1;
		}
		a[i] = val;
	}
	
	
	public void sort(int[] a) {
		int len = a.length;
		makeMaxHeap(a, len-1);
		for(int i=len-1; i>0; i--) {
			swap(a, i, 0);
			heapFixDown(a, 0, i);
		}
	}
	
	public void swap(int[] a, int i, int j) {
		int tp = a[i];
		a[i] = a[j];
		a[j] = tp;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort heapSort = new HeapSort();
		int[] a = {1,2,4,6,3,5};
		heapSort.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
