package codingInterviewGuide.bat;

import java.util.PriorityQueue;
import java.util.*;

public class Middle {

	
	int count = 1;
    public int[] getMiddle(int[] A, int n) {
        // write code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n/2+1, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            add(minHeap, maxHeap, A[i]);
            if(i%2==0){
            	res[i] =  maxHeap.peek();
            }else{
                res[i] =  (maxHeap.peek() + minHeap.peek())/2;
            }
        }
        return res;
            
    }
    
    public void add(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap, int val){
        if(count%2==0){            
            maxHeap.offer(val);
            minHeap.offer(maxHeap.poll());
        }else{
            minHeap.offer(val);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		Middle middle = new Middle();
		int[] res = middle.getMiddle(a, 6);
		System.out.println(Arrays.toString(res));

	}

}
