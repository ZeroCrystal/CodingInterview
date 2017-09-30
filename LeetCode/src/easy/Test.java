package easy;


import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		System.out.printf("%s\n",str);
		
//		while(scanner.hasNextLine()){
//			String str = scanner.nextLine();
//			System.out.printf("%s\n", str);
//		}
		String str = "abc123";
		System.out.println(str.replaceFirst("abc", "456"));
		StringBuffer aBuffer = new StringBuffer();
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.clear();
		
//		arrayList.removeAll();
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.isEmpty();
		queue.poll();
	}
	

}
