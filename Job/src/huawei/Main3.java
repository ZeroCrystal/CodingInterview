package huawei;

import java.util.Arrays;
import java.util.Scanner;

class Address implements Comparable<Address>{
	String addr;
	String[] elem;
	
	public Address(String addr) {
		// TODO Auto-generated constructor stub
		this.addr = addr;
		this.elem = addr.split("\\.");
		
	}

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		String[] elem1 = this.elem;
		String[] elem2 = o.elem;
		int idx1 = elem1.length -1;
		int idx2 = elem2.length -1;
		int flag = 0;
		while (idx1>=0 && idx2>=0) {
			if (elem1[idx1].equals(elem2[idx2])) {
				idx1--;
				idx2--;
			}else {
				flag = elem1[idx1].compareTo(elem2[idx2]) >0? 1:-1;
				break;
			}
		}
		if (idx1<0 && idx2 >=0 ) {
			flag = -1;
		}
		if (idx1>=0 && idx2 <0 ) {
			flag = 1;
		}
		return flag;
	}
	
	
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String[] inputs = str.split("\\|");
		Address[] arr = new Address[inputs.length];
		
		for (int i = 0; i < inputs.length; i++) {
			arr[i] = new Address(inputs[i]); 
//			System.out.println(Arrays.toString(arr[i].elem));
		}
		
//		System.out.println(Arrays.toString(inputs));
		Arrays.sort(arr);
		
		StringBuffer res = new StringBuffer();
		for(Address addr: arr) {
			res.append(addr.addr);
			res.append("|");
		}
		res.deleteCharAt(res.length()-1);
		System.out.println(res.toString());
	}

}
