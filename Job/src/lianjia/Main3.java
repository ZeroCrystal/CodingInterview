package lianjia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Bean{
	int score;
	int cost;
	
	public Bean(int score, int cost) {
		// TODO Auto-generated constructor stub
		this.score = score;
		this.cost = cost;
	}
}

public class Main3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		int avg = in.nextInt();
		
		Bean[] data = new Bean[n];
		for(int i=0; i<n; i++) {
			data[i] = new Bean(in.nextInt(), in.nextInt());
		}
		in.close();
		Arrays.sort(data, new Comparator<Bean>() {

			@Override
			public int compare(Bean o1, Bean o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}			
		});
		
		int cur = 0;
		int line = n*avg;
		for(int i=0; i<n; i++) {
			cur += data[i].score;
		}
		int res = 0;
		if(cur< line) {
			for(int i=0; i<n; i++) {				
				int score = data[i].score;
				for(int j=score+1; j<= r; j++) {
					cur ++;
					res += data[i].cost;
					if(cur>=line) {
						System.out.println(res);
						return ;
					}
				}
			}
		}
	}	
}
