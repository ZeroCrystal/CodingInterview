import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;


public class ConstructBinaryTree {

	
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,6,7,8,9};
//		System.out.println(Arrays.binarySearch(nums, 0, 2, 2));
		System.out.println(Arrays.binarySearch(nums, 4));
		System.out.println(Arrays.binarySearch(nums, 5));
		System.out.println(Arrays.binarySearch(nums, 1, 6, 4));
		System.out.println(Arrays.binarySearch(nums, 1,6,5));
		System.out.println(Arrays.binarySearch(nums, 10));
		
		String[] strs = {"1","2","3","4"};
		System.out.println(String.join(",", strs));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
		String result = Arrays.toString(nums).replaceAll("[\\[\\]]", "");
		System.out.println(Arrays.toString(nums).replaceAll("[\\[\\]]", ""));
//		throw new RuntimeException("Empty");
		
		int n = 3;
		System.out.println(n&1);
	}

}
