package baidu;

import java.util.Scanner;

public class Main {

	public static int num(int n) {
		int res = 1;
		n = n*5;
		while(n!=0) {
			res *=n--;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(num(n));
	}

}
