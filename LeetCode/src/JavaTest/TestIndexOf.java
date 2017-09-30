package JavaTest;

public class TestIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "12345";
		String str2 = "23451";
		
		String str3 = str1+str1;
		System.out.println(str3.indexOf(str2));
		
		String a = "hello";
		String s = new String("hello");
		System.out.println(a=="hello");
		System.out.println(s=="hello");

		
		Integer a1 = new Integer("1");
		Integer a2 = 1;
		Integer b = new Integer(1);
		int c = 1;
		System.out.println(a1==a2);
		System.out.println(a1==b);
		System.out.println(a2==b);
		System.out.println(a1==1);
		System.out.println(a1==c);
		System.out.println(b==c);
	}

}
