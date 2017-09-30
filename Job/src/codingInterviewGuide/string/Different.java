package codingInterviewGuide.string;

import java.util.Arrays;

public class Different {
	
	
	public boolean checkDifferent(String str) {
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		for(int i=0; i < arr.length-1; i++ ) {
			if(arr[i]==arr[i+1]) 
				return false;
		}
		
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fbcdbea";
		char[] arr = str.toCharArray();
		System.out.println(arr.toString());
		
	}

}
