package JavaTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object(){
			public boolean equals(Object obj) {
				return true;
			}
		};
//		System.out.println(o.equals("aa"));
		System.out.println(o.equals(1.0));
		
		ArrayList<Integer> list = new ArrayList<>();
//		list.remove(index);
		
		
		StringBuffer aBuffer = new StringBuffer();
		aBuffer.append("abc");
		aBuffer.charAt(0);
		aBuffer.insert(0, "d");
		System.out.println(aBuffer.toString());
//		"ABC".indexOf(str);
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		maxHeap.peek();
		
//		Scanner sc = new Scanner(System.in);
		
		
	}

}
