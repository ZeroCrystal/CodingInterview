package jindong;

import java.io.FileInputStream;

public class Student extends Person{
	
	static {
		System.out.println("S1");
	}
	{
		System.out.println("S2");
	}
	
	public Student() {
		System.out.println("S3");
		// TODO Auto-generated constructor stub 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student();
		
		 
	}

}
