import java.util.Scanner;


public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = "";
        if (in.hasNextLine()) {//注意while处理多个case
            s = in.nextLine();
        }
//        System.out.println(s);
        int res = 0;
        int count = 0;
        char pre = 'a';
        char cur;
        for(int i= 0; i < s.length(); i++){
        	cur = s.charAt(i);
//        	System.out.println(count+", " + cur + ", "+ pre);
        	if (cur == '?') {
				count++;
			}else{
				if(cur!=pre){
					if (count%2!=0) {
						res++;
					}
				}else {
//					System.out.println(count+", " + cur + ", "+ pre);
					if(count%2==0){
						res++;
					}
				}
				
				count=0;
				pre = cur;
			}
        }
        if(s.charAt(s.length()-1)=='?'){
    		if (count%2!=0) {
				res++;
			}
    	}
        
        System.out.println(res);
        
	}

}
