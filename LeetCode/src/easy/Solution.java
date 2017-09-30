package easy;

import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
	
	
	
	public int[] twoSum(int[] nums, int target) {
	    int[] result = null;
	    TreeMap<Integer, String> numMap;
		
		//for sort and search the given array
		numMap = new TreeMap<>();
		int n =  nums.length;
		for (int i = 0; i < n; i++) {
			if (numMap.containsKey(nums[i])) {
				String value = numMap.get(nums[i]);
				value += ","+i;
				numMap.put(nums[i], value);
			}else {
				numMap.put(nums[i], i+"");
			}
			
		}
		
		NavigableMap<Integer, String> headMap = numMap.headMap(target, true);
		if (headMap.size() == 0) {
			headMap = numMap;
		}
		
		boolean find = false;
		
	    Integer[] keyArray = headMap.keySet().toArray(new Integer[0]);
	    boolean  two_equal = false;
	    
	    for (int i = keyArray.length-1; i >= 0; i--) {
			two_equal =  false;
			
	    	int eval_key =  target -  keyArray[i];
			if (eval_key==keyArray[i]) {
				two_equal = true;
			}
			String plus_idx = numMap.getOrDefault(eval_key,"null");
			System.out.println(eval_key + ", "+ plus_idx);
			if (!plus_idx.equals("null")) {
				String[] tpStrings = plus_idx.split(",");
				int len = tpStrings.length;
				
				if (two_equal) {
					if (len>=2) {
						result = sort_result(Integer.valueOf(tpStrings[0]), Integer.valueOf(tpStrings[1]));
						find = true;
						break;
					}
					
				}else {
					int eval_idx = Integer.valueOf(headMap.get(keyArray[i]).split(",")[0]);
					
					result = sort_result(Integer.valueOf(tpStrings[0]), eval_idx);
					
					find = true;
					break;
				}
				
				
				
			}	
		}
	    
	     
		return result;
	}
	
	private int[] sort_result(int a, int b) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
		if (a < b) {
			result[0] = a;
			result[1] = b;
		}else {
			result[1] = a;
			result[0] = b;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]  nums = {2, 7, 1, 11, 15};
//		int target = 9;
		
//		int[] nums = {230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,92,325,422,815,650,920,125,277,336,221,847,168,23,677,61,400,136,874,363,394,199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,282,306,506,44,926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,13,457,328,227,652,365,430,803,59,858,538,427,583,368,375,173,809,896,370,789};
//		
//		int target = 542;
		
//		int[] nums = {0,3,4,0};
//		int target = 0;
		
		int[] nums = {-3,4,3,90};
		int target = 0;
		
		Solution solution = new Solution();
//		solution.test_treemap(nums, target);
		int[] result = solution.twoSum(nums, target);
		
		if (result==null) {
			System.out.println("not find!");
		}else {
			System.out.println(result[0]+" "+ result[1]);
		}
		
	}
	
	private  void test_treemap(int[] nums, int target) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> testMap = new TreeMap<>();
		for (int i = 0, n = nums.length; i < n; i++) {
			testMap.put(nums[i], i);
		}
		
		
		System.out.println(testMap.getOrDefault(9, null));
		
		NavigableMap<Integer, Integer> headMap = testMap.headMap(target, true);
		
		
		Set<Integer> headKeySet = headMap.keySet();
		for (Integer integer : headKeySet) {
			System.out.println(integer);
		}
	}

}
