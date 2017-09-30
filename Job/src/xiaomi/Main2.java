package xiaomi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> res = new ArrayList<Integer>();  
		res.add(1);     
		
        for(int i=1; i<=n; i++){  
            for(int j=0; j<res.size(); j++){  
            	res.set(j, res.get(j)*i);                 
            }  
            for(int j=0; j<res.size(); j++){  
                if(res.get(j) > 9){  
                    if(res.size()==j+1){  
                    	res.add(j+1,0); 
                    }  
                    res.set(j+1, res.get(j+1) + res.get(j)/10);  
                    res.set(j, res.get(j)%10);  
                }  
            }             
        }  

        for(int index=res.size()-1;index>-1;index--){  
            System.out.print(res.get(index));  
        }        

	}

}
