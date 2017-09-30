package codingInterviewGuide.bat;

import java.util.Collections;
import java.util.Stack;

public class StackReverse {

	
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}else {
			int last = get(stack);
			reverseStack(stack);
			stack.push(last);
		}
	}
	
	public static int get(Stack<Integer> stack) {
		int result = stack.pop();
		if(stack.isEmpty()) {
			return result;
		}else {
			int last = get(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		
		reverseStack(stack);
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
	}

}
