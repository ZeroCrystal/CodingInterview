package didi;

import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
	
	
	public static int getMax(int n, int[] a) {
		HashSet<Integer> hashSet = new HashSet<>();
		int res = 0;
		int cur = 0;
		hashSet.add(cur);
		for(int i=0; i<n; i++) {
			cur ^= a[i];
			if (hashSet.contains(cur)) {
				res++;
				hashSet.clear();
			}
			hashSet.add(cur);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		System.out.println(getMax(n, a));
	}
}
