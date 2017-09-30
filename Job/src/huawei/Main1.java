package huawei;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char[] str1 = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();
		sc.close();
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> con = new HashSet<>();
		for(int i=0; i<str1.length; i++) {
			set.add(str1[i]);
		}
		
		for (int i = 0; i < str2.length; i++) {
			if (set.contains(str2[i])) {
				con.add(str2[i]);
			}
		}
		
		for (int i = 0; i < str1.length; i++) {
			if (con.contains(str1[i])) {
				str1[i] = '_';
			}
		}
		System.out.println(new String(str1));
		
		for (int i = 0; i < str2.length; i++) {
			if (con.contains(str2[i])) {
				str2[i] = '_';
			}
		}
		System.out.println(new String(str2));
		
	}

}
