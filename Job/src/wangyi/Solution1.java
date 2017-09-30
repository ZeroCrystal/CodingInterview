package wangyi;

import java.util.*;

public class Solution1 {
	
	public static String check(int[] nums) {
		if(nums.length<=2)  return "Possible";
		Arrays.sort(nums);
		boolean flag = true;
		int d = nums[1] - nums[0];
		for(int i=2; i<nums.length; i++) {
			if((nums[i] - nums[i-1]) != d) {
				flag = false;
				break;
			}
		}
		return flag?"Possible":"Impossible";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		
		System.out.println(check(nums));
		
	}

}
