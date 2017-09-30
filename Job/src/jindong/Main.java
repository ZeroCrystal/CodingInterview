package jindong;

import java.util.Scanner;


public class Main {
	public static long  getNum(int n) {
		long res=0;
		for(int a=1;a<=n;a++){
			for(int b=1;b<=n;b++)
				for(int c=1;c<=n;c++)
					for(int d=1;d<=n;d++){
						if(Math.pow(a, b)==Math.pow(c, d))
							res+=1;
					}
		}
		return res%1000000007;
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		for(int i=0; i<100;i++) {
			System.out.println(getNum(1000));
//		}
//		int n=scan.nextInt();
//		System.out.println(getNum(n));
	}
}