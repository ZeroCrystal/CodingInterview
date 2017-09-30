package toutiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int c = in.nextInt();
		ArrayList<ArrayList<Integer>> index = new ArrayList<>();
		for(int i=0; i<c ; i++) {
			index.add(new ArrayList<Integer>());
		}
		for(int i=0; i<n; i++) {
			int t = in.nextInt();
			
			for(int j=0; j<t; j++) {
				index.get(in.nextInt()-1).add(i);
			}
		}
		in.close();
		
		int res = 0;
		ArrayList<Integer> tp;
		for(int i=0; i<c; i++) {
			tp = index.get(i);
			Collections.sort(tp);
			if (tp.size() >0) {
				if((n + tp.get(0) - tp.get(tp.size()-1)  ) < m ) {
					res++;
				}else {
					for(int j = 1; j<tp.size(); j++) {
						if(tp.get(j) - tp.get(j-1) < m) {
							res++;
							break;
						}
					}						
			    }
			}
		
		}	
		System.out.println(res);
	}
		
	
}
