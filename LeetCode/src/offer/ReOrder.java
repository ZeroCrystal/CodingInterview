package offer;

import java.util.Arrays;

public class ReOrder {

	
	public static void reOrderArray(int [] array) {
        int j=2;
        int pre = 1;
        while(j < array.length){
            move2end(array, pre, j-1);
            swap(array, pre, j);
            pre++;
            j+=2;
            
        }
//        move2end(array, pre, j-1);
        
    }
    
    public static void move2end(int[] array, int i, int j){
        if(i==j) return ;
        int t = array[j];
        for(int k = j; k>i; k--){
            array[k] = array[k-1];
        }
        array[i] = t;
//        System.out.println(Arrays.toString(array) + " "+i+" "+ j );
    }
    
    
    
    
    public static void swap(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    
    
    
    public  static void reOrderArray2(int [] array) {
        for(int i= 0;i<array.length-1;i++){
             for(int j=0;j<array.length-1-i;j++){
                 if(array[j]%2==0&&array[j+1]%2==1){
                     int t = array[j];
                     array[j]=array[j+1];
                     array[j+1]=t;
                 }
             }
         }
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,6,1,3,5,7};
		reOrderArray2(nums);
//		reOrderArray(nums);
		System.out.println(Arrays.toString(nums));
	}

}
