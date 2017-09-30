package codingInterviewGuide.bat;

import java.util.Arrays;

public class LeftMostAppearance {

	
	public static int rightMostAppearance(int[] a, int val) {
		int lo = 0, hi = a.length-1;
		int mid=0;
		while (lo<hi) {
			mid = lo + (hi-lo)/2+1;
			if (a[mid]>val) {
				hi = mid-1;
			}else{
				lo = mid;
			}
		}
		if(a[hi]==val) {
			return hi;
		}else {
			return -1;
		}
	}
	
	public static int  findpos(int[] a, int val) {
		int lo = 0, hi = a.length-1;
		int mid = 0;
		while (lo<hi) {
			mid = lo + (hi-lo)/2;
			if(a[mid] < val) {
				lo = mid+1;
			}else {
				hi = mid;
			}
		}
		if(a[lo]==val) {
			return lo;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,3,4,4,6};
		int idx = Arrays.binarySearch(a, 3);
		if (idx>0) {
			System.out.println(idx);
		}else {
			System.out.println(-idx-1);
		}
		
//		System.out.println(findpos(a, 3));
		System.out.println(rightMostAppearance(a, 6));
	}
}
