package exercise;

import java.util.Scanner;

public class ReverseString {

	    
	    
	    public static String reverse(char[] str){
	        int s = 0;
	        
	        reverse(str, 0, str.length-1);
	        
	        for(int i=0; i< str.length; i++){
	            if(str[i]==' '){
	                reverse(str, s, i-1);
	                s = i+1;
	            }
	        }
	        reverse(str, s, str.length-1);
	        return new String(str);
	    }
	    
	    public static void reverse(char[] str, int begin, int end){
	        while(begin<end){
	            char tmp = str[begin];
	            str[begin] = str[end];
	            str[end] = tmp;
	            begin++;
	            end--;
	        }
	    }
	    
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        System.out.println(reverse(str.toCharArray()));
	    }
	

}
