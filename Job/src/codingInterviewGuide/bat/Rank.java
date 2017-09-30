package codingInterviewGuide.bat;

public class Rank {

	 public int[] getRankOfNumber(int[] A, int n) {
	        // write code here
	        int[] res = new int[n];
	        res[0] = 0;
	        TreeNode root = new TreeNode(A[0], 1);
	        TreeNode p;
	        TreeNode pre;
	        
	        for(int i=1; i<n; i++) {
	        	res[i] = TreeNode.insert(root, A[i]);
	        }
	        
	        return res;
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode{
    
    int val;
    int h;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val, int h){
        this.val = val;
        this.h = h;
        this.left = null;
        this.right = null;
    }
    
    public static int  insert(TreeNode root, int val){
        TreeNode p = root;
        if(root==null) return 0;
        int res = 0;
        if(p.val > val){
            p.h +=1;
            if(p.left==null){
                p.left = new TreeNode(val, 1);
                res = 0;
            }else{
                res =  insert(root.left, val);
            }            
        }else if(p.val < val){
            res = p.h;
            if(p.right==null){
                p.right = new TreeNode(val, 1);
               
            }else{
                res += insert(p.right, val);                
            }
        }else {
        	res = p.h;
        	p.h ++;
        }
		return res;
    }
    
}
