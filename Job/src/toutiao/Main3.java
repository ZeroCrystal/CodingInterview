package toutiao;

import java.util.Scanner;

class Bean{
	char ch;
	int i;
	public Bean(char ch, int i) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
		this.i = i;
	}
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] tp = line.split(" ");
		String str = tp[0];
		int m = Integer.valueOf(tp[1]);
	}

}
