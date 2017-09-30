package lianjia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> data = new TreeSet<>();
		try {
			Scanner in = new Scanner(new File("random.in"));
			int n = in.nextInt();
			for(int i=0; i<n; i++) {
				data.add(in.nextInt());
			}
			in.close();
			
			FileWriter fw = new FileWriter("random.out");
			fw.write(data.size() + "\n");
			StringBuffer buffer = new StringBuffer();
			for(Integer elem: data) {
				buffer.append(elem + " ");
			}
			fw.write(buffer.toString().trim() + "\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
