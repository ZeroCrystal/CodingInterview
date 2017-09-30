package sort;

import java.util.Arrays;

public class InsertSort {

	
	public static void sort(int[] a) {
		if(a==null || a.length ==0 ) return ;
		int len = a.length;
		
		for (int i = 1; i < len; i++) {
			
			//method 1 : reduce the access of the array
//			int tp = a[i];
//			int j = i;			
//			while (j>=0) {
//				j--;
//				if (a[j] > a[i]) {
//					a[j+1] = a[j];
//				}else {
//					break;
//				}
//			}
//			a[j+1] = tp;
			
			//method2 : ordinary method
//			for (int j = i; j > 0; j--) {
//				if (a[j] < a[j-1]) {
//					Utils.swap(a, j, j-1);
//				}
//			}
			
			for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
				Utils.swap(a, j, j-1);
			}
			
			
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
