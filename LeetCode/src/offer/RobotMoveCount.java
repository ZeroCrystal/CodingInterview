package offer;

public class RobotMoveCount {

	
	public static int movingCount(int threshold, int rows, int cols)
    {
		boolean[][] flag = new boolean[rows][cols];
        return helper(threshold, rows, cols, 0,0, flag);
    }
    
    public static int helper(int thre, int rows, int cols, int i, int j, boolean[][] flag){
       
        if(i<0||i>=rows || j<0|| j>=cols ) return 0;
        if( flag[i][j] || getSum(i) + getSum(j) > thre) return 0;
//        System.out.println(getSum(i) + getSum(j));
        flag[i][j] = true;
        
        int left = helper(thre, rows, cols, i, j-1, flag);
        int right = helper(thre, rows, cols,i, j+1, flag);
        int top = helper(thre, rows, cols, i-1, j, flag);
        int down = helper(thre, rows, cols, i+1, j, flag);

        int next = left + right + top + down;
        
//        flag[i][j] = false;
        return 1+next;
        
    }
    
    static int getSum(int k){
        int res = 0;
        while(k>0){
            res += k%10;
            k/=10;
        }
//        System.out.println("getSum: " + k + " " + res);
        return res;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(movingCount(15, 20, 20));
	}

}
