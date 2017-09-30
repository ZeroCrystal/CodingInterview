import java.util.Arrays;
import java.util.Scanner;


public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 0;
		String s = "";
        if(in.hasNextLine()) {//注意while处理多个case
            n = Integer.valueOf(in.nextLine());
            s = in.nextLine();
        }
        String[] tp = s.split(" ");
        int len = tp.length;
        int[] nums = new int[len];
        for(int i=0; i< len; i++){
        	nums[i] = Integer.valueOf(tp[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int mid = len/2;
        int left,right;
        left = mid-1;
        right = mid+1;
       
	}
	
	

}
