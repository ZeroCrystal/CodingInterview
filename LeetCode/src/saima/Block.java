package saima;

import java.util.Scanner;


class Bean{
	int cost;
	String block;
	
	public Bean(int cost, String block) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
		this.block = block;
	}
	
	
}

public class Block {

	static Bean res = null; 
	static char[] path; 
//	static int t = 0;
//	static int countLeft = 0;
//	static int countRight = 0;
		
	public static Bean minCost1(String test, int[][] cost, int m) {
		if((m&1)==1) return new Bean(-1, "");
		int count = 0;
		
		int min = 0;
		int k = test.length()/2;;
		StringBuffer block = new StringBuffer();
		
		int t = 0;
		for(int i=0; i<test.length(); i++) {
			if(test.charAt(i)=='?') {
				if(count>0 && count < k ) {
					if(cost[t][0] <= cost[t][1]) {
						min += cost[t][0];
						block.append("(");
						count++;
					}else {
						min += cost[t][1];
						block.append(")");
						count--;
					}
				}else {
					min += cost[t][1];
					block.append(")");
					count--;
				}
				t++;
//				System.out.println(i +", " + t);
			}else {
				if(test.charAt(i)=='(') {
					count++;
					block.append("(");
				}else {
					count--;
					block.append(")");
				}
			}
			
		}
		
		return new Bean(min, block.toString());
	}
	
	
	public static void minCost(String test, int[][] cost, int m ,int countLeft, int countRight, int j,int t, int pre) {
		if(j==m) {
			if(countLeft==countRight) {
				if(res==null) {
					res = new Bean(pre, new String(path));
				}else {				
					if(pre < res.cost) {
						res = new Bean(pre, new String(path));
					}
				}
			}
			
//			System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + new String(path));
		}else {
//			System.out.println(j + ", " + countLeft + ", " + countRight + ", " +t+", " + pre+ ", " + new String(path));
			if (countLeft < countRight) {
//				res.cost = -1;
				return;
			}
			if(test.charAt(j) == '?') {
//				System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + t + ", " +  new String(path));
//				System.out.println(j + ", "+  countLeft + ", " +countRight + ", " + m/2);
				if(countLeft < m/2) {
					if(countLeft==countRight) {
						path[j] = '(';
//						System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + t + ", " +  new String(path));
						minCost(test, cost, m, countLeft+1, countRight, j+1, t+1, pre + cost[t][0]);
					}else {
						path[j] = '(';		
//						System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + t + ", " +  new String(path));
						minCost(test, cost, m, countLeft+1, countRight, j+1, t+1, pre + cost[t][0]);					
						
						path[j] = ')';					
						minCost(test, cost, m, countLeft, countRight+1, j+1, t+1,  pre + cost[t][1]);
					}
					
				}else {
//					System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + t + ", " +  new String(path));
					path[j] = ')';
					minCost(test, cost, m, countLeft, countRight+1, j+1,t+1, pre + cost[t][1]);
				}
				
			}else {
//				System.out.println("here");
				if(test.charAt(j)=='(') {
					path[j] = '(';
					countLeft++;
				}else {
					path[j] = ')';
					countRight++;
				}
				minCost(test, cost, m, countLeft, countRight,  j+1,t, pre);
			}
//			System.out.println(j + ", " + countLeft + ", " + countRight + ", " +pre+ ", " + new String(path));
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  =  new Scanner(System.in);
		String str;
		int m = 0 ;
		
		String[] tp;
		int[][] cost = new int[50000][2];
		
		String test = null;
		while (in.hasNext()) {
			str = in.next();			
			
			int n = str.length();
			m=0;
			for(int i=0; i<n; i++) {
				if(str.charAt(i)=='?') m++;
			}
			
			for(int i=0; i<m; i++) {
//				tp = in.nextLine().split(" ");
//				cost[i][0] = Integer.valueOf(tp[0]);
//				cost[i][1] = Integer.valueOf(tp[1]);
				cost[i][0] = in.nextInt();
				cost[i][1] = in.nextInt();
//				System.out.println(cost[i][0] + ", " + cost[i][1]);
			}
			res = null;
			
//			countLeft = 0;
//			countRight = 0;
			path = new char[n];
			if((n&1)==1) System.out.println(-1);
			else {
				minCost(str, cost, n, 0, 0, 0, 0, 0);
				if (res==null || res.cost==-1) {
					System.out.println(-1);
				}else {
					System.out.println(res.block );
					System.out.println(res.cost);
				}
			}
			
		}
	}

}
