package sougou;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		Double[] dots = new Double[n];
		
		for (int i = 0; i < n; i++) {
			dots[i] = Double.valueOf(sc.nextLine());
		}
		sc.close();
		
		int res = 0;
		Double tp;
		for(int i=n-1; i>1; i--){			
			tp = dots[i] - 180;
//			for(int j=0; j<i-1; j++) {
//				if (dots[j] > tp) {
//					res += i-j-1;
//				}
//			}			
//			for(int j=i-2; j>=0; j--) {
//				if (dots[j] > tp) {
//					res += i-j-1;
//				}else {
//					break;
//				}
//			}
			int j = Arrays.binarySearch(dots, tp);
			
			if (j<0) {
				j = -j -1;
			}
			if (dots[j] - tp==0) {
				j++;
			}
//			System.out.println(i + ", " + j);
			int k = i-j ;
			res += k*(k-1)/2;
			
		}
		
		System.out.println(res);
		
		
		
	}

}
