package codingInterviewGuide.bat;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDivision {

	public int findMaxDivision(int[] A, int n) {
        // write code here
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
			bucket.add(new ArrayList<>());
		}
        int min = A[0];
        int max = A[0];
        for(int i=1; i<n; i++) {
        	if(A[i] > max) {
        		max = A[i];
        	}
        	if(A[i] < min) {
        		min = A[i];
        	}
        }
        System.out.println(max + " " + min);
        double gap = (max-min)/(double)n;
        for(int i=0; i<n;i++) {
        	int j = (int) Math.round((A[i] -min)/gap) ;
        	if(A[i] == max) System.out.println(j + ", " + (A[i] -min)/gap);
        	bucket.get(j).add(A[i]);
        }
        
        System.out.println(bucket.get(n).size());
        
        int i = 0, j=0;
        int maxGap = 0;
        
        for(i=0,j=0; i<n;i=j) {
        	while(bucket.get(i).size()==0) {
        		i++;
        	}
        	max = Collections.max(bucket.get(i));
        	j = i+1;
        	if(j < n+1) {
        		while(bucket.get(j).size()==0) {
        			j++;
        		}
        		if(j >= n+1) {
        			break;
        		}
        		min = Collections.min(bucket.get(j));
        		if(min - max > maxGap) {
        			maxGap = min-max;
        		}
        	}
        }
        return maxGap;
    }
	
	public int getMin(ArrayList<Integer> list) {
		int min = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		return min;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a={1,2,5,4,6};
		int[] a = {468,412,327,206,10,68,150,561,153,374,598,437,71,29,224,45,614,558,600,460,370,164,617,464,366,148,138,75,270,389,66,14,272,60,243,586,184,89,302,16,415,566,5,271,232,39,128,151,617,336,198,341,206,548,444,341,207,32,553,491,604,268,313,378,275,272,261,206,561,374,71,559,415,208,133,446,99,420,377,424,310,432,280,219,10,513,18,541,526,104,239,53,523,164,613,85,267,305,153,166,497,621,341,198,538,247,389,237,127,256,228,463,527,520,422,578,400,258,12,54,442,408,353,193,167,108};
		MaxDivision maxDivision = new MaxDivision();
		System.out.println(maxDivision.findMaxDivision(a, a.length));
	}

}
