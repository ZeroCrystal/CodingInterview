package offer;

import java.util.*;
import java.util.Map.*;
public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number
    //in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
    	HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:numbers){
            if(map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, 0);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value==1){
                res.add(key);
            }
        }
        System.out.println(Arrays.toString(res.toArray()));
//        duplication = new int[res.size()];
        for(int i=0; i< res.size(); i++){
            duplication[i] = res.get(i);
        }
        System.out.println(Arrays.toString(duplication));
        
        if(res.size() >0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
		int[] a = {2,1,3,1,4};
		int[] res = new int[2] ;
		boolean flag = duplicate(a, a.length, res);
		System.out.println(flag + ", " + Arrays.toString(res));
	}
}
