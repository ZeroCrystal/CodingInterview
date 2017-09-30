package codingInterviewGuide.bat;

public class Max {
	
	
	public int getMax(int a, int b) {
        // write code here
        int sa = sign(a);
        int sb = sign(b);
        int c = a - b;
        int sc = sign(c);
        int diffab = sa^sb;
        int sameab = diffab^1;
        System.out.println(sa + ", " + sb + ", "+ sc );
        
        int reA = sameab*sc + diffab*sa;
        int reB = flip(reA);
        System.out.println(reA + ", " + reB);
        return reA*a + reB*b;
        
    }
    
    
    int sign(int a){
        return flip(a>>>31);
    }
    
    int flip(int a){
        return a^1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max max = new Max();
		System.out.println(-1>>31);
		System.out.println(max.getMax(10, 20));
	}

}
