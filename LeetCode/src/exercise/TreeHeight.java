package exercise;

import java.util.HashMap;
import java.util.Scanner;

public class TreeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> deepMap = new HashMap<>();
		HashMap<Integer, Integer> childMap = new HashMap<>();
		deepMap.put(0, 1);
		childMap.put(0, 0);
		int res = 0;
		int cur = 0;
		for(int i=0; i<n-1; i++) {
			int parent = sc.nextInt();
			int child =  sc.nextInt();
			if (!deepMap.containsKey(parent) || childMap.getOrDefault(parent, 0) >=2) {
				continue;
			}
			cur = deepMap.get(parent) + 1;
			deepMap.put(child, cur);
			childMap.put(child, 0);
			childMap.put(parent, childMap.getOrDefault(parent, 0) +1);
			res = Math.max(cur, res);
		}
		sc.close();
		System.out.println(res);
	}

}
