package ali;

import java.util.Scanner;

public class Solution {
	int res;
	
	int maxMoney(int[][] A) {
		int row = A.length;
		int col = A[0].length;
		res = Integer.MIN_VALUE;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				walker(A, i, j, Integer.MAX_VALUE, 0);
//				System.out.println(res);
			}
		}
		
		return res;
	}
	
	
	void walker(int[][] A, int i, int j, int pre, int cur) {
		System.out.println(i + ","+j + "," +pre + ", " + cur);
		if(i <0 || i>A.length || j <0 || j>A[0].length || A[i][j] >= pre) {
			
			if(cur > res) {
				res = cur;
			}
//			System.out.println(res);
			return ;
			
		}
		
		cur ++;
		walker(A, i-1, j, A[i][j], cur);
		walker(A, i+1, j, A[i][j], cur);
		walker(A, i, j-1, A[i][j], cur);
		walker(A, i, j+1, A[i][j], cur);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 String first = in.nextLine();
		 String[] tp = first.split(" ");
		 int row = Integer.valueOf(tp[0]);
		 int col = Integer.valueOf(tp[1]);
		 int[][] A = new int[row][col];
		 int i = -1;
		 String line = "";
		 
		 
		 
	     while (in.hasNextLine()) {
	    	 line = in.nextLine();
	    	 if(line.equals("")) {
	    		 break;
	    	 }
	    	 i++;
	    	 tp = line.split(" ");
	    	 for(int j = 0; j < tp.length; j++) {
	    		 A[i][j] = Integer.valueOf(tp[j]);
	    	 }
	     }
	     
	     Solution solution = new Solution();
	     int max = solution.maxMoney(A);
	     System.out.println(max);
	}

}
