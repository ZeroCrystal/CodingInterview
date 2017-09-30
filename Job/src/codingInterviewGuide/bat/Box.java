package codingInterviewGuide.bat;

import java.util.Arrays;

public class Box  {
	
	public int getHeight(int[] w, int[] l, int[] h, int n) {
        //insert sort
        //desc
        for(int i=1; i<n;i++){
            for(int j=i; j>0;j--){
                if(w[j] < w[j-1]){
                    swap(w, j, j-1);
                    swap(h, j, j-1);
                    swap(l, j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(w));
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(h));
        
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            int tp = 0;
            for(int j=i-1; j>=0; j--){
                if(w[j] < w[i] && l[j]<w[i]){
                    tp = Math.max(tp, dp[j]);
                }
            }
            dp[i] = tp +h[i];            
        }
        System.out.println(Arrays.toString(dp));
        
        int res = dp[0];
        for(int i = 1; i<n ;i++){
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    
    public void swap(int[] a, int i, int j){
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
    }
    
    
    public int getHeightv2(int[] w, int[] l, int[] h, int n) {
        // write code here
    	
    	class Info implements Comparable<Info> {
    		int w, l, h;
    		
    		public Info(int w, int l, int h) {
				// TODO Auto-generated constructor stub
    			this.w = w;
    			this.l = l;
    			this.h = h;
			}

			@Override
			public int compareTo(Info o) {
				// TODO Auto-generated method stub
				if(this.w > o.w) {
					return 1;
				}else if (this.w == o.w) {
					return 1;
				}else {
					return -1;
				}
			}
			
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return w + ", " + l + ", " + h +"\n";
			}
    		
    		
    	}
    	Info[] box= new Info[n];
    	for(int i=0; i<n;i++) {
    		box[i] = new Info(w[i], l[i], h[i]);
    	}
    	Arrays.sort(box);
    	
  
       System.out.println(Arrays.toString(box));

       
      int[] dp = new int[n];
      int[] end = new int[n];
      end[0] = box[0].w;
      int lo = 0;
      int hi = 0;
      int m = 0;
      int right = 0;
      dp[0] = box[0].h;
      for(int i=1; i<n; i++) {
    	  lo = 0;
    	  hi = right;
    	  while(lo<=hi) {
    		  m = (lo+hi)/2;
    		  if(box[i].l > end[m]) {
    			  lo = m+1;
    		  }else {
    			  hi = m-1;
    		  }
    	  }
    	  if(lo>right) {
    		  dp[lo] = dp[lo-1] + box[i].h;
    	  }else {
    		 
    		  if(lo>0) {
    			  dp[lo] = Math.max(dp[lo], dp[lo-1] + box[i].h);
    		  }else {
    			  dp[lo] = Math.max(dp[lo], box[i].h);
    		  }
    		  
    	  }
    	  right = Math.max(right, lo);
    	  end[lo] = box[i].l;    	 
      }
      
       return dp[right];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {1,2,3,3};
		int[] l = {3,1,2,2};
		int[] h = {2,1,1,3};
		Box box = new Box();
		System.out.println(box.getHeight(w, l, h, 4));
		
		
	}

}
