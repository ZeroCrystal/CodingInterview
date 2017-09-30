package xiaomi;

import java.util.Scanner;

public class Main {

	
	public static String minBlock(char[] text, char[] pattern) {
		int left = 0;
		int res = 0;
		int i = 0;
		int idx = 0;
		int min = Integer.MAX_VALUE;
		while (i<text.length) {
			if (text[i] == pattern[idx]) {
				if (idx>0) {
					idx++;
					
				}else {
					left=i;
					idx = 1;
				}
				
				if(idx==pattern.length) {
					int len = i -  left +1;
					if (len < min) {
						min = len;
						res = left;
					}
					left = i+1;
					idx=0;
				}
				
			}
			i++;
		}
		if (min !=Integer.MAX_VALUE) {
			return res + " " + (res +min-1);
		}else {
			return "-1 -1";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String line = "";
		String[] tp = null;
		while (sc.hasNext()) {
			line = sc.nextLine();
			tp = line.split(" ");
			System.out.println(minBlock(tp[0].toCharArray(), tp[1].toCharArray()));
		}
		sc.close();
	}

}
