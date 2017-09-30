import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;




public class BinaryTree {

	HashSet<String> treeSet;
	HashMap<String, Integer[]> charMap;
	
	
	
	private void genSet(String treeString) {
		// TODO Auto-generated method stub
		int tlen = treeString.length();
		treeSet = new HashSet<>();
		charMap = new HashMap<>();
		
		int count = 0;
		int pre_layer = -1;
		for (int i = 1; i < tlen; i+=2) {
			int num_layer = Integer.valueOf(treeString.charAt(i)) -49;
//			System.out.println(num_layer);
			
			if (num_layer>pre_layer) {
				count = -1;
				pre_layer = num_layer;
			}
			count++;
			treeSet.add(num_layer+"_"+count);
			
//			String pString = treeString.substring(i-1, i-1);
			String pchar = String.valueOf(treeString.charAt(i-1));
//			System.out.println(pchar);
			Integer[] pos = new Integer[2];
			pos[0] = num_layer;
			pos[1] = count;
			charMap.put(pchar, pos);
			
		}
		
//		System.out.println(charMap.get("a")[0]+ ","+charMap.get("a")[1]);
//		System.out.println(charMap.get("b")[0]+ ","+charMap.get("b")[1]);
		
		
//		for (String tstring : treeSet) {
//			System.out.println(tstring);
//		}
	}
	
	
	private int searchChild(Integer[] pos) {
		// TODO Auto-generated method stub
	
		int num_layer = pos[0];
		int num_id = pos[1];
		
		int target_id = num_id*2;
		String target_pos = (num_layer+1)+"_"+target_id;
		if (treeSet.contains(target_pos)) {
			Integer[] newpos = new Integer[2];
			newpos[0] = num_layer+1;
			newpos[1] = 0;
			;
			return 1+ searchChild(newpos);
		}else {
			return 0;
		}
		
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bTree = new BinaryTree();
		
		String treeString = args[0];
		String searchString = args[1];
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		bTree.genSet(treeString);
//		int[] pos = new int[2];
//		pos[0] = 1;
//		pos[1] = 0;
//		int num =0;
//		int deep= bTree.searchChild(pos)+1;
//		System.out.println(num);
//		System.out.println(deep);
		
		int[] results = new int[searchString.length()];
		for (int i = 0; i < searchString.length(); i++) {
			String search_char = String.valueOf(searchString.charAt(i));
			Integer[] search_pos = bTree.charMap.get(search_char);
			int deep= bTree.searchChild(search_pos)+1;
			System.out.printf("%d ", deep);
			
		}
		
		
		
	}

}
