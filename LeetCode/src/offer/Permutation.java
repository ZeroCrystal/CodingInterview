package offer;

import java.util.Arrays;
import java.util.Comparator;

public class Permutation {

	public void runRecursivePermutation(int[] a) {
		getAllPermutation(a, 0);
	}
	
	
	public void runRecursivePermutationDuplicated(int[] a) {
		getAllPermutationDup(a, 0);
	}
	
	
	void getAllPermutationDup(int[] a, int idx) {
		// TODO Auto-generated method stub
		if(idx == a.length) {
			System.out.println(Arrays.toString(a));
			return;
		}
		for(int j = idx; j < a.length; j++) {
		
			if (contains(a,idx, j)) {
				continue;
			}else {
				swap(a, idx, j);
				getAllPermutation(a, idx+1);
				swap(a, idx, j);
			}
		}	
		
	}
	
	public boolean contains(int[] a, int i , int j) {
		for(int k = i; k < j; k++) {
			if(a[k] ==a[j])
				return true;
		}
		return false;
	}


	public void getAllPermutation(int[] a, int idx) {
		
		if(idx == a.length) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		for(int i = idx; i< a.length; i++) {
			swap(a, idx, i);
			getAllPermutation(a, idx+1);
			swap(a, idx, i);
		}
	}
	
	public void runNoRecursionPermutation(int[] a) {
		
		Arrays.sort(a);
		int len = a.length;
		while (true) {
			System.out.println(Arrays.toString(a));
			
			int i,j;
			//get the first right 
			for(i = len-2; i>=0; i--) {
				if(a[i] < a[i+1])
					break;
				if(i ==0)
					return;
			}
			
			for(j = len-1; j>i; j--) {
				if(a[j] > a[i])
					break;
			}
			swap(a, i, j);
			inverse(a, i+1, len-1);
		}
		
		
	}
	
	public void swap(int[] a,int i, int j) {
		int tp = a[i];
		a[i] = a[j];
		a[j] = tp;
	}
	
	public void inverse(int[] a, int i, int j) {
		while (i < j) {
			swap(a, i++, j--);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation perm = new Permutation();
		int[] a = {1,1,2,3,4};
//		perm.runNoRecursionPermutation(a);
//		perm.runRecursivePermutation(a);
		perm.runRecursivePermutationDuplicated(a);
	}

}
