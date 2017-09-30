package didi;

import java.util.Scanner;

public class Main1 {	
	
	public static int getUglyNumber(int index) {
        if(index <=0) return 0;
        if(index ==1) return 1;
        int[] res = new int[index];
        res[0] = 1; 
        int idx2 = 0, idx3 = 0, idx5 = 0;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        for(int i=1; i< index; i++){
            int min = Math.min(Math.min(factor2, factor3), factor5);
            res[i] = min;
            if(factor2==min){
                factor2 = 2*res[++idx2];
            }
            if(factor3==min){
                factor3 = 3*res[++idx3];
            }
            if(factor5==min){
                factor5 = 5*res[++idx5];
            }
        }
        return res[index-1];
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(getUglyNumber(n));
	}

}
