package codingInterviewGuide.bat;

import java.util.Arrays;
import java.util.LinkedList;

public class NextElement {

	
	public int[] findNext(int[] A, int n) {
        // write code here
        LinkedList<Integer> later = new LinkedList<>();
        int[] res = new int[n];
        res[n-1] = -1;
        later.offer(A[n-1]);
        for(int i=n-2; i>=0; i--) {
        	int cur = A[i];
        	while(!later.isEmpty() && later.peekLast() < cur ) {
        		later.pollLast();
        	}
        	if(later.isEmpty()) {
        		res[i] = -1;
        	}else {
        		res[i] = later.peekLast();
        	}
        	later.offerLast(cur);
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextElement nextElement = new NextElement();
		int[] A = {11,13,10,5,12,21,3};
		int[] res = nextElement.findNext(A, 7);
		System.out.println(Arrays.toString(res));
		
	}

}
