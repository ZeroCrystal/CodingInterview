package wangyi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


class Node{
	int id;
	HashSet<Node> next;
	
	public Node(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		next = new HashSet<>();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}

public class City {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		Node[] city = new Node[n];
		for (int i = 0; i < n; i++) {
			city[i] = new Node(i);
		}
		for(int i=0; i<n-1; i++) {
			int t = in.nextInt();
//			city[i+1].next.add(city[t]);
			if(t!=i+1)
				city[t].next.add(city[i+1]);
		}		
		in.close();
		
		int[] res = new int[1];
		
		int max = 0;
		ArrayList<Integer> len = new ArrayList<>();
		for(Node child: city[0].next) {
			res[0] = 1;
			next(child, 1, l, res);
			if(max==0) {
				max = res[0];
				
			}else if (max<l) {
				if(res[0] > max) {
					max = res[0];
				}else {
					if(max + (res[0]-1)*2+1 <= l) {
						
					}
				}
			}
			
		}
		next(city[0], 1, l, res);
		
		System.out.println(res[0]);		

	}
	
	
	public static void next(Node cur, int count, int l, int[] res) {
		if(count ==l) {
			res[0] = l;
			return;
		}
		if(cur.next.size()==0) {
			if(count>res[0]) res[0] = count;
		}else {
			for (Node child: cur.next) {
				next(child, count+1, l, res);
			}
		}
		
	}
	

}
