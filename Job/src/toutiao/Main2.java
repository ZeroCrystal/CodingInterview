package toutiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] a = new int[n];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for(int i=0 ;i< n; i++) {
			a[i] = in.nextInt();
			if (map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(a[i], list);
			}			
		}
		int q = in.nextInt();
		int[] res = new int[q]; 
		ArrayList<Integer> tp;
		for(int i=0; i<q; i++) {
			int l = in.nextInt()-1;
			int r = in.nextInt()-1;
			int k = in.nextInt();
			tp = map.get(k);
			Collections.sort(tp);
			int left = Collections.binarySearch(tp, l);
			if(left<0) {
				if(tp.get(0) > left) {
					left = 0;
				}else {
					res[i] = 0;
					continue;
				}
			}
			int right = Collections.binarySearch(tp, r);
			if(right < 0) {
				if(tp.get(0) > left) {
					left = 0;
				}else {
					res[i] = 0;
					continue;
				}
			}
			
			
			/*
			for(int j=l; j<=r; j++) {
				if(Collections.binarySearch(tp, j)>=0) {
					res[i] ++;
				}
			}
			*/
			
			/*
			for(int j=0; j<tp.size(); j++) {
				if(tp.get(j)>l) {
					left = j;
					break;
				}
			}
			for(int j=left; j<tp.size(); j++) {
				if(tp.get(j) > r) {
					right = j;
					break;
				}
			}
			res[i] = right - left + 1;
			*/
		}
		in.close();
		for(int i=0; i<q; i++)
			System.out.println(res[i]);
		
		
	}

}
