package codingInterviewGuide.bat;

import java.util.Arrays;
import java.util.Stack;

public class TwoStack {

	
	public static void stackSort(int[] a) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		
		
		for(int i=0; i<a.length; i++) {
			if(!stack1.isEmpty()&&stack1.peek() > a[i]) {
				stack2.push(stack1.pop());
			}
			stack1.push(a[i]);
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
		for(int i=0; i< a.length; i++) {
			a[i] = stack1.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,3,5};
		stackSort(a);
		System.out.println(Arrays.toString(a));
	}

}
