package sort;

import java.util.Arrays;

public class HeapSort {

	
	
	
	public static void sort(int[] a) {
		if(a==null || a.length ==0) return ;
		int N = a.length;
		//construct heap
		for(int i=N/2-1; i >=0; i--){
			sink(a, i, N);
		}
		//move min to end
		for(int i=N-1; i>0; i--){
			Utils.swap(a, i, 0);
			sink(a, 0, i);
		}
	}
	
	
	public static void fixUp(int[] a, int i) {
		int val = a[i];
		int j = (i-1)/2;
		while (j>=0 && i!=0) {
			if(a[j] <= val)
				break;
			a[i] = a[j];
			i = j;
			j = (i-1)/2;
		}
		a[i] = val;
	}
	
	public static void sink(int[] a, int i, int N) {
		int tp = a[i];
		int j = i*2+1;
		while(j < N){
			if(j+1<N && a[j+1] < a[j]) j++;
			if(a[j] >= tp) break;
			
			a[i] = a[j];
			i = j;
			j = 2*i+1;
			
		}
		a[i] = tp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
