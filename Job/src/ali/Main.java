package ali;

import java.util.Scanner;

public class Main {
	
	public static int getID1(int k) {
		int pre = 0;
		int cnt = 1;
		int cur = 1;
		while(cur<k) {
			pre = cur;
			cur += ++cnt;
		}
		int res = 0;
		while(pre!=k) {
			pre++;
			res++;
		}
		return res;
	}
	
	public static int getID2(int n) {
		int k = 0;
		while(n > (k+1)*9*Math.pow(10, k)) {
			n-= (k+1)*9*Math.pow(10, k);
			++k;
		}
		int base = (int)Math.pow(10, k);
		base += (n-1)/(k+1);
		n = (n-1)%(k+1);
		for(int i=0;i<(k-n);i++) {
			base /=10;
		}
		return base%10;
	}
	
	public static int getID(int n) {
		int[] a = new int[100000];
		int[] b = new int[100000];
		a[1] = 1;
		b[1] = 1;
		int i;
		for(i=2; i<=34000; i++) {
			a[i] = (int) (a[i-1] + Math.log10(i) +1);
			b[i] = a[i] + b[i-1];
		}
		i=0;
		while (b[i] < n) {
			i++;
		}
		int m = n - b[i-1];
		i=0;
		while (m > a[i]) {
			i++;
		}
		int t = a[i] - m;
		while (t--!=0) {
			i/=10;
		}
		return i%10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.close();
		System.out.println(getID(k));
	}

}
