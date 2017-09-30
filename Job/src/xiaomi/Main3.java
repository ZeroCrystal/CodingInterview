package xiaomi;

import java.util.Scanner;

public class Main3 {

	public static int fibo(int n) {
		if(n<1) return 0;
		if(n==1) return 1;
        if(n==2) return 2;
		int res = 2;
		int pre = 1;
		int tmp = 0;
		for(int i=3; i<=n; i++) {
			tmp = res;
			res = res + pre;
			pre = tmp;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			System.out.println(fibo(sc.nextInt()));
		}
		sc.close();

	}

}
