package codingInterviewGuide.bat;

public class ShortestSubSequence {

	
	public static int findSubsequence(int[] a) {
		int len = a.length;
		int max = a[0], min = a[len-1];
		int left = 0, right = 0;
		for(int i=0; i<len; i++) {
			if(a[i] >= max) {
				max = a[i];
			}else {
				right = i;
			}			
		}
		for(int i=len-2; i>=0; i--) {
			if(a[i] <= min) {
				min = a[i];
			}else {
				left = i;
			}
		}
		if(right==0) return 0;
		return right - left+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,6,5,9,10};
		System.out.println(findSubsequence(a));
	}

}
