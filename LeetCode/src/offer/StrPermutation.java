package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class StrPermutation {

	
    public  ArrayList<String> Permutation(String str) {
    	ArrayList<String> res = new ArrayList<>();
    	if(str==null ||str.equals("")) return res;
        char[] chs = str.toCharArray();
    	getPerm(res, chs, 0, chs.length);
        
    	Collections.sort(res);
        return res;        
     }
    
    public boolean isSwap(char[] chs, int i, int j) {
		// TODO Auto-generated method stub
    	for(; i<j ; i++){
    		if(chs[i]==chs[j]){
    			return false;
    		}
    	}
    	return true;
	}
	
    public void swap(char[] chs, int i, int j) {
		char t = chs[i];
		chs[i] = chs[j];
		chs[j] = t;
	}
    
    public  void getPerm(ArrayList<String> res, char[] chs, int start, int len) {
		if(start==len-1){
			res.add(new String(chs));
		}else {
			for(int i= start; i<len; i++){
				if(isSwap(chs, start, i)){
					swap(chs, start, i);
					getPerm(res, chs, start+1, len);
					swap(chs, start, i);
				}
			}
		}
	}
    
    
    
    public void runNoRecursionOfPermutation(int[] a){  
        
        Arrays.sort(a);//对数组排序  
        while(true){  
              
            printArray(a);//输出一个排列  
              
            int i;//从后向前，记录一对顺序值中的小值下标  
            int j;//从后向前，记录比i大的第一个数  
              
            for(i = a.length-2; i >= 0; i--){  
                  
                if(a[i] < a[i+1])//如果找到i跳出  
                    break;  
                else if(i == 0)//说明是最大逆序数退出函数  
                    return;  
            }  
            for(j = a.length-1; j > i; j--){  
                if(a[j] > a[i])//找到j跳出  
                    break;  
            }  
            swap(a, i, j);//交换i，j  
            reverse(a, i+1, a.length-1);//翻转  
        }  
    }  
    public void swap(int[] a, int i, int j) {  
      
        int temp = a[i];  
        a[i] = a[j];  
        a[j] = temp;  
    }  
    public void reverse(int[] a, int i, int j){  
        while(i < j)  
            swap(a, i++, j--);  
    }  
      
        public void printArray(int[] a) {  
          
        for(int i = 0; i < a.length; i++){  
            System.out.print(a[i] + " ");  
        }  
        System.out.println();  
    }  
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};  
		StrPermutation permutation = new StrPermutation();
		permutation.runNoRecursionOfPermutation(a);
	}

}
