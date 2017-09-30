package codingInterviewGuide.bat;

public class Finder {

	
	
	
	public int findElement(int[] A, int n, int x) {
        // write code here
        int lo = 0; 
        int hi = n-1;
        int mid;
        while(lo<=hi && lo>=0 && hi<n){
        	System.out.println(lo + ", "+ hi);
            if(A[lo]==x){
                return lo;
            }
            if(A[hi]==x){
                return hi;
            }
            mid = lo + (hi-lo)/2;
            if(A[mid] == x){
                return mid;
            }
            if(A[lo]>A[hi]){            	
            	if(A[mid] > A[lo]) {
            		if(x < A[mid] && x > A[lo]) {
            			hi = mid-1;
            		}else {
            			lo = mid+1;
            		}
            	}else {
            		if(x < A[lo] && x > A[mid]) {
            			lo = mid+1;
            		}else {
            			hi = mid-1;
            		}
            	}            	
            }else{
                if(A[mid] < x){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }           
        }
        System.out.println(lo);
        return A[lo]==x? lo:-1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {43,44,45,46,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42};
		Finder finder = new Finder();
		finder.findElement(A, 46, 5);

	}

}
