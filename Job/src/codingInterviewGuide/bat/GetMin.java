package codingInterviewGuide.bat;

public class GetMin {

	
	public static int min(int[] a) {
		if(a==null ) return -1;
		int lo = 0, hi = a.length-1;
		
		int mid = 0;
		while(lo <=hi) {
			mid = lo + (hi-lo)/2;
			if(a[mid]<a[lo]) {
				hi = mid;
			}else if (a[mid] >a[hi]) {
				lo = mid+1;
			}else {
				break;
			}
		}
		if(lo==hi) return a[lo];
		int min = a[lo];
		for(int i=lo; i<=hi;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,1,2,3,3};
		System.out.println(min(a));
	}

}
