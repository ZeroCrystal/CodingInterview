package huawei;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str == null) {
			System.out.println("ERROR");
			return ;
		}
		sc.close();
		String[]  tp = str.split("-");
		int k = 1;
		
		int[] nums = {1, 3, 5};
		if (tp.length!=3) {
			System.out.println("ERROR");
			return ;
		}
		for(int i=0; i<3; i++) {
			if (tp[i].length()!=nums[i]) {
				System.out.println("ERROR");
				return ;
			}
		}
		int mask = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch!='-') {
				if (ch<'0' || ch > '9') {
					System.out.println("ERROR");
					return ;
				}
				mask += (ch-'0')*k++;
			}
		}
		mask = mask%11;
		
		StringBuffer res = new StringBuffer();
		res.append(str);
		if (mask==10) {
			res.append("-X");
		}else {
			res.append("-");
			res.append(mask);
		}
		System.out.println(res.toString());
		
	}
}
