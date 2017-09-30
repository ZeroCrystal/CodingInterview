package codingInterviewGuide.bat;

import java.util.Arrays;

public class Queens {

	
	int res=0;
    public int nQueens(int n) {
        // write code here
        int[] dp = new int[n];
//        Arrays.fill(dp, -1);
        next(dp, n, 0);
        return res;
    }
    
    public void next(int[] dp, int n, int j){
        if(j==n) {
        	
            res++;
            return;
        }
        boolean flag = false;
        for(int i=0; i<n; i++){
            flag = true;
            for(int k =0; k<j; k++){
                if(dp[k]==i || (j-k)==Math.abs(i-dp[k])){
                    flag = false;
                    break;
                }
            }
            if(flag){
            	
                dp[j]=i;
                next(dp, n, j+1);
            }            
        }
        
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queens queens = new Queens();
		System.out.println(queens.nQueens(4));
	}

}
