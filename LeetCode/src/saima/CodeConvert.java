package saima;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeConvert {
	
	
	public static String  convert1(String str) {
		int col = 0;
		int i;
		for ( i = 0; i < str.length(); i++) {
			if(str.charAt(i)< 'A' || str.charAt(i) > 'Z') break;
			int n = str.charAt(i) - 'A' +1;	
//			System.out.println(n + ", " +col);
			col = col *26 + n;
//			System.out.println(n + ", " +col);
		}
		
		return "R"+str.substring(i) + "C" + col;
		
	}
	
	public static String convert2(int m, int n) {
		StringBuffer res = new StringBuffer();		
		res.append(getTo26(n));
		res.append(m);
		return res.toString();		
	}
	
	public static String getTo26(int n) {
		StringBuffer res = new StringBuffer();
		while (n>0) {
			int m = n%26;
			n = n/26;
//			System.out.println(m);
			res.append((char)('A'+m-1));		
		}
//		res.append((char)('A'+n-1));
		
		return res.reverse().toString();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    String re1="R";	// Any Single Word Character (Not Whitespace) 1
	    String re2="(\\d+)";	// Integer Number 1
	    String re3="C";	// Any Single Word Character (Not Whitespace) 2
	    String re4="(\\d+)";	// Integer Number 2
	    Pattern p = Pattern.compile(re1+re2+re3+re4,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	    
	    
	    String re5="((?:[A-Z][A-Z]+))";	// Word 1
	    String re6="(\\d+)";	// Integer Number 1

	    Pattern p1 = Pattern.compile(re1+re2,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	   
	    
	    String str;
	    int n = Integer.valueOf(in.nextLine());
	    String[] strs = new String[n];
	    for (int i = 0; i < n; i++) {
	    	strs[i] = in.nextLine();
		}
	    for(int i=0; i<n; i++) {
	    	
	    	Matcher m = p.matcher(strs[i]);
		    if (m.find()){		        
		        int int1=Integer.valueOf(m.group(1));		        
		        int int2=Integer.valueOf(m.group(2));
//		        System.out.println(int1 + ", " + int2);
		        System.out.println(convert2(int1, int2));
		    }else {
		    	System.out.println(convert1(strs[i]));
			}
	    }
	    
	    
	}

}
