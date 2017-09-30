package JavaTest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		strList.add("3");
		System.out.println(strList);
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		Iterator<Integer> iter = intList.iterator();
		while (iter.hasNext()) {
			if(iter.next()==2)
				iter.remove();
		}
		
		
		System.out.println(intList);
		System.out.println(Math.abs(Integer.MIN_VALUE));
		System.out.println(Integer.MAX_VALUE+1);
		System.out.println(Integer.MAX_VALUE+2);
	}

}
