package sort;

import java.util.Arrays;

public class SelectionSort {

	
	public static void	sort(int[] a) {
		if(a==null || a.length ==0 ) return ;
		int len = a.length;
		for (int i = 0; i < len-1; i++) {
			int idx = i;
			for (int j = i+1; j < len; j++) {
				if (a[j] < a[idx]) {
					idx = j;
				}
			}
			Utils.swap(a, i, idx);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
