package codingInterviewGuide.string;

import java.util.Arrays;

public class Reverse {

	
	 public static String reverseString(String iniString) {
	        // write code here
	        char[] arr = iniString.toCharArray();
	        reverse(arr, 0, arr.length-1);
	        int start = 0;
	        for(int i = 0; i< arr.length; i++){
	            if(arr[i]==' '){
	                reverse(arr, start, i-1);
	                start = i+1;
	            }
	        }
	        
	        if(start < arr.length){
	            reverse(arr, start, arr.length-1);
	        }
	        
	        return  new String(arr);
	    }
	    
	    public static void reverse(char[] arr, int start, int end){
	       
	        while(start < end){
	            char tmp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = tmp;
	            start ++;
	            end --;
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("This is nowcoder"));
		
		String str = "abc";
		StringBuffer buffer = new StringBuffer();
		buffer.length();
//		Arrays.fill(s, val);
		
	
	}

}
