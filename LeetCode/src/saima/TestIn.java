package saima;

import java.util.Scanner;

public class TestIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 1;
		String string = "";
		int m=0;
		while (in.hasNext()) {
			string = in.next();
			
			n = in.nextInt();
			m = in.nextInt();
			System.out.println(string + ", " + n + ", " + m);
		}
	}

}
