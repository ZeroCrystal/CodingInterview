package codingInterviewGuide.bat;

import java.util.HashMap;

public class FindPair {

	
    public int countPairs(int[] A, int n, int sum) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(A[i])){
               res += map.get(A[i]);              
            }
            map.put(sum-A[i], map.getOrDefault(sum-A[i], 0)+1);
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPair findPair = new FindPair();
		int[] A = {1,2,3,4,5};
		System.out.println(findPair.countPairs(A, 5, 6));
	}

}
