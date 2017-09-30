package offer;

public class ReverseCount {

	
	static int[] tp;
    public static int  InversePairs(int [] array) {
        if(array==null || array.length <=1) return 0;
        int len = array.length;
     	tp = new int[len];
        
        return mergeSort(array, 0, len-1);
    }
    
    public static int mergeSort(int[] nums, int start, int end){
        if(start >= end) return 0;
        int mid = (end+start)/2;
        int leftCount = mergeSort(nums, start, mid);
        int rightCount = mergeSort(nums, mid+1, end);
        
        for(int i=start; i<=end; i++){
            tp[i] = nums[i];
        }
        int preIdx = mid;
        int backIdx = end;
        int count = 0;
        int idx = end;
        while(preIdx >= start && backIdx > mid){
            if(tp[preIdx] > tp[backIdx]){
                count += backIdx - mid;
                nums[idx--] = tp[preIdx--];
            }else{
                nums[idx--] = tp[backIdx--];
            }
        }
        
        while(preIdx>=start){
            nums[idx--] = tp[preIdx--];
        }
        while(backIdx>mid){
            nums[idx--] = tp[backIdx--];
        }
        
        return (leftCount + rightCount + count)%1000000007;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,1,2,3,4,5,6,7,8,0};
		System.out.println(InversePairs(nums));
	}

}
