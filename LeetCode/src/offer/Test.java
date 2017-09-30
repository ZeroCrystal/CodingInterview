package offer;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;


import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.peek();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.poll();
		String str = new String();
		
		HashSet<Integer> hashSet = new HashSet<>();
		Integer[] arr = hashSet.toArray(new Integer[0]);
		
		System.out.println(10<<2);
		
		HashMap<Integer, Integer> map = new HashMap<>();
//		map.containsKey(key)
//		map.entrySet();
		map.entrySet();
		for(Entry<Integer, Integer> entry:map.entrySet()){
			
		}
		
//		map.containsKey(key)
		
		Character character = new Character('a');
		character = 'a';
		
		
		Integer[] values = map.values().toArray(new Integer[0]);
		
		System.out.println(character);
		
		int[] nums = {1,2,3,3,3,3};
//		System.out.println(Arrays.binarySearch(nums, 2));
		System.out.println(GetNumberOfK(nums,3));
		
		
		ArrayList<Integer> aList = new ArrayList<>();
		aList.toArray();
		aList.toArray();
//		aList.set(index, element)
		StringBuffer aBuffer = new StringBuffer();
//		aBuffer.toString();
		aBuffer.append("123");
		aBuffer.insert(0, "456");
		System.out.println(aBuffer.toString());
		aBuffer.setLength(0);
		aBuffer.length();
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		String str1 = "adg";
		for(int i=0; i<str1.length(); i++) {
			map1.put(str1.charAt(i), 1);
		}
		
		
		try {
			Scanner scanner = new Scanner(new File(" "));
			while (scanner.hasNextInt()) {
				
			}
			
			TreeSet<Integer> set = new TreeSet<>();
			set.clear();
			for (Integer integer : set) {
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int[] a = {2,2,4,6};
		
		Arrays.sort(a);
		ArrayList<Integer> aab = new ArrayList<>();
		Collections.reverseOrder();
	}
	
	
	public static int GetNumberOfK(int [] array , int k) {
	       if(array==null||array.length==0) return 0;
	        int len = array.length;
	        if(k< array[0] || k>array[len-1]) return 0;
	        
	        //get first apprear
	        int lo = 0, hi = len-1;
	        int mid = 0;
	        while(lo<hi){
	        	
	            mid = lo + (hi-lo)/2;
	            System.out.println("lo: " +lo + "  hi: " +hi + " mid: "+mid);
	            if(array[mid] < k){
	                lo = mid+1;
	            }else{
	                hi = mid;
	            }
//	            System.out.println("lo: " +lo + "  hi: " +hi + " mid: "+mid);
	        }
	        System.out.println(lo);
	        int res = 0;
	        for(int i = lo; i<len; i++){
	            if(array[i]==k){
	                res++;
	            }else{
	                break;
	            }
	        }
	        return res;       
	        
	        
	    }

}
