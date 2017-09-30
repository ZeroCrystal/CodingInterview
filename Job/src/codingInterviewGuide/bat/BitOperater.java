package codingInterviewGuide.bat;import java.nio.file.Watchable;

public class BitOperater {

	
	public static int getMax(int a, int b) {
		int sa = getSign(a);
		int sb = getSign(b);
		int c = a - b;
		int sc = getSign(c);
		int diff = sa ^ sb;
		int same = flip(diff);
		int resA = diff*sa + same * sc;
		int resB = flip(resA);
		return resA*a + resB*b;
	}
	
	
	public static int getSign(int n) {
		return flip((n>>31)&1);
	}
	
	public static int  flip(int n) {
		return n^1;
	}
	
	public static void swap(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a + ", " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(1, 2);
		System.out.println(getMax(1, 2));
	}

}
