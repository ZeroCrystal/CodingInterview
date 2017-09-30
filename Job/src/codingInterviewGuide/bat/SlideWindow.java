package codingInterviewGuide.bat;

import java.util.Arrays;
import java.util.LinkedList;

public class SlideWindow {

	
	public static int[] slide(int[] a, int w) {
		int len = a.length;
		int[] res = new int[len-w+1];
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<len; i++) {
			while(!queue.isEmpty() && a[queue.peekLast()] < a[i]) {
				queue.pollLast();
			}
			queue.offerLast(i);
			if(i - queue.peekFirst() >=w) {
				queue.pollFirst();
			}
			if(i >= w-1)
				res[i-w+1] = a[queue.peekFirst()];
		}
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,3,5,4,3,3,6,7};
		
		int[] res = slide(a, 3);
		System.out.println(Arrays.toString(res));
	}

}
