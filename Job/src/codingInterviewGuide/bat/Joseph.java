package codingInterviewGuide.bat;

import java.util.ArrayList;
import java.util.Arrays;

public class Joseph {


		public int getResult(int n) {
	        // write code here
	        int[] dp = new int[n];
	        int k=2;
	        int count = n;
	        int start = 0;
	        int t;
	        int sp = 0;
	        while(count>1){	        	
	            count=0;
	            int i=start;
	            i++;
	            count++;
	            t = 1;
	            while(i!=start){
	                if(i==n){
	                    i = 0;
	                    if(i==start) {
	                    	break;
	                    }
	                }	                
	                if(dp[i]==0){
	                    if(t++%k!=0){
	                        dp[i] = 1;
	                    }else{
	                        sp = i;
	                        count++;
	                    }
	                }	                
	                i++;
	            }
//	            System.out.println(Arrays.toString(dp) + ", "+ count);
	            start = sp;
	            k++;
	            i = start +1;	            
	        }	        
	        return start+1;
	    }
        
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joseph joseph = new Joseph();
		System.out.println(joseph.getResult(5));
	}

}
