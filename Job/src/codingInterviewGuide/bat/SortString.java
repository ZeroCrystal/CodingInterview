package codingInterviewGuide.bat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortString {

	

	
	
	public void name() {
		
	}
	
	public ArrayList<String> sortStrings1(String[] str, int n) {
		/*
		class RichString implements Comparable<RichString>{

			String str;
			char[] arr;
			
			public RichString(String str) {
				// TODO Auto-generated constructor stub
				this.str = str;
				arr = str.toCharArray();
				Arrays.sort(arr);
			}
			
			@Override
			public int compareTo(RichString o) {
				// TODO Auto-generated method stub
				if (this.equals(o)) {
					return 0;
				}else {
					return str.compareTo(o.str);
				}
				
			}
			
			
			@Override
			public boolean equals(Object obj) {
				// TODO Auto-generated method stub
				RichString other = (RichString) obj;
				if(arr.length!=other.arr.length) {
					return false;
				}else {
					for(int i=0; i<arr.length; i++) {
						if(arr[i]!=other.arr[i]) {
							return false;
						}
					}
					return true;
				}
			}
		}
		*/
		HashMap<String, String> map = new HashMap<>();
		for(int i=0; i<n ;i++) {
			String ss = new String(str[i]);
			char[] tp = ss.toCharArray();
			Arrays.sort(tp);
			String key = new String(tp);
			if (map.containsKey(key)) {
				String value = map.get(key);
				if(value.compareTo(str[i]) > 0) {
					map.put(key, str[i]);
				}
			}else {
				map.put(key, str[i]);
			}
		}
		
		Collection<String> vv = map.values();
		ArrayList<String> res = new ArrayList<>();
		res.addAll(vv);
		Collections.sort(res);
		return res;
		
		
		
		/*
		RichString[]  tp = new RichString[n];
		for(int i=0; i<n;i++) {
			tp[i] = new RichString(str[i]);			
		}
		
		Arrays.sort(tp);
		
		ArrayList<String> res = new ArrayList<>();
		RichString min = null;
		for(int i=0; i<n;i++) {
			if(min==null) {
				min = tp[i];
			}else {
				if(!tp[i].equals(min)) {
					res.add(min.str);
					min = null;
				}else {
					min = min.str.compareTo(tp[i].str) >0 ? min: tp[i];
				}
			}
			
		}
		if(min!=null) {
			res.add(min.str);
		}
		
		return res;
		*/
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
