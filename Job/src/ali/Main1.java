package ali;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	
	static int min = Integer.MAX_VALUE;
	
	public static void getPath(int[] T, int[][] road, int n, int target, int pre, int j) {
		int a = pre / T[j];
		if((a&1)==1) {
			int b = pre %T[j];
			pre += T[j] - b;
		}
		if(j==target) {
			min = Math.min(pre, min);
		}else {
			for(int i=0; i<n;i++) {
				if(road[j][i]>0) {
					getPath(T, road, n, target, pre + road[j][i], i);
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		int[] T = new int[n];
		int t ;
		String line;
		for(int i=0; i<n; i++) {
			line = in.nextLine();
			T[i] = Integer.valueOf(line.split(",")[1]);
		}
//		int[][] road = new int[n][n];
		ArrayList<ArrayList<Integer>> road = new ArrayList<>();
		for(int i=0; i<n; i++) {
			road.add(new ArrayList<>());
		}
		int m  =  Integer.valueOf(in.nextLine());
		
		String[] tp;
		for(int i=0; i<m; i++) {
			line = in.nextLine();
			tp = line.split(",");
			int s = Integer.valueOf(tp[0]);
			int e = Integer.valueOf(tp[1]);
			int c = Integer.valueOf(tp[2]);
			
		}
		line = in.nextLine();
		tp = line.split(",");
		int start = Integer.valueOf(tp[0]);
		int target = Integer.valueOf(tp[1]);
		in.close();
//		getPath(T, road, n, target, 0, start);
		System.out.println(min);
	}

}
