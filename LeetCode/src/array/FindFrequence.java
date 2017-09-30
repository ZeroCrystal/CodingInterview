package array;


import java.util.*;
import java.util.Map.*;

public class FindFrequence {

	
	public static int findHalf(int[] arr) {
		if(arr==null || arr.length==0) return 0;
		
		int count = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count==0) {
				num = arr[i];
				count = 1;
			}else if (num==arr[i]) {
				count++;
			}else {
				count--;
			}
		}
		
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					count ++;
				}
			}
			if (count > arr.length/2) {
				return num;
			}else {
				return 0;
			}
		
		
	}
	
	public static int[] findMajor(int[] arr, int K) {
		if (K < 2) {
			return null;
		}
		HashMap<Integer, Integer> cands = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (cands.containsKey(arr[i])) {
				cands.put(arr[i], cands.get(arr[i]) +1);
			}else {
				if (cands.size() == K-1) {
					allMinus(cands);
				}else {
					cands.put(arr[i], 1);
				}
			}
		}
		
		//get real count
		HashMap<Integer, Integer>  reals = getReal(arr, cands);
		
		//output large than N/K
		
		return null;
	}
	
	
	private static HashMap<Integer, Integer> getReal(int[] arr,
			HashMap<Integer, Integer> cands) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> realMap = new HashMap<>();
		
		
		
		return null;
	}

	private static void allMinus(HashMap<Integer, Integer> cands) {
		// TODO Auto-generated method stub
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry: cands.entrySet()){
			int key = entry.getKey();
			int value = entry.getValue();
			if (value==1) {
				removeList.add(key);
			}
			cands.put(key, value-1);
		}
		
		for (Integer key : removeList) {
			cands.remove(key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,3};
		System.out.println(findHalf(a));
	}

}
