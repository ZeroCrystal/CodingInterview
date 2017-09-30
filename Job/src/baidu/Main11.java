package baidu;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] takeList = new int[n][2];
		for(int i=0; i<n ; i++) {
			takeList[i][0] = sc.nextInt();
			takeList[i][1] = sc.nextInt();
		}
		sc.close();
		
		int[] easy=  new int[n];
		int[] hard = new int[n];
		easy[0] = takeList[0][0];
		hard[0] = takeList[0][1];
		for(int i=1; i < n; i++) {
			if(i-2>=0) { 
				easy[i] = takeList[i][0] + Math.max(hard[i-1], easy[i-1]);
				hard[i] = takeList[i][1] + Math.max(hard[i-2], easy[i-2]);
			}else {
				easy[i] = takeList[i][0] +  Math.max(hard[i-1], easy[i-1]);
				hard[i] = takeList[i][1];
			}
//			System.out.println(easy[i] + ", " + hard[i]);
		}
		System.out.println(Math.max(easy[n-1], hard[n-1]));
		
	}

}
