package codingInterviewGuide.bat;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ScalaSort {

	
	public static void sort(int[] a, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0; i <k-1; i++) {
			minHeap.offer(a[i]);
		}
		for(int i = k-1; i< a.length ; i++) {
			minHeap.offer(a[i]);
			a[i-k+1] = minHeap.poll();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,4,3,6,5,8,7,10,9};
		sort(a, 2);
		
		System.out.println(Arrays.toString(a));
	}

}
