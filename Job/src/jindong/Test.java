package jindong;

public class Test {

	
	public void print(Object  o) {
		System.out.println("Object");
	}
	
	public void print(String  s) {
		System.out.println("String");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.print(null);
	}

}
