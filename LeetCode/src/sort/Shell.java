package sort;

import java.util.Arrays;

public class Shell {

	
	public static void sort(int[] a) {
		if(a==null || a.length ==0 ) return ;
		int len = a.length;
		
		int h = 1;
		while (h<len/3) {
			h = h*3+1;
		}
		while (h>=1) {
			for (int i = h; i < len; i++){
				for (int j = i; j >=h && a[j] < a[j-h]; j-=h) {
					Utils.swap(a, j, j-h);				
				}
				
			}
			h /=3;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2,5,4,7,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
