package array;

import java.util.Arrays;

public class PrintMatrixZigZag {

	
	public static void printZigZag(int[][] A) {
		int tr = 0;
		int tc = 0;
		int br = 0;
		int bc = 0;
		int endR = A.length -1;
		int endC = A[0].length -1;
		boolean fromUp = false;
		while(tr!= endR+1){
			printLevel(A, tr, tc, br, bc, fromUp);
//			System.out.println(tr+" "+ tc+ " "+ br+" "+bc);
			tr = tc==endC?tr+1:tr;
			tc = tc==endC?tc:tc+1;
			bc = br==endR?bc+1:bc;
			br = br==endR?br:br+1;			
			fromUp = !fromUp;
		}
		System.out.println();
	}
	
	public static void printLevel(int[][] A, int tr, int tc, int br, int bc, boolean flag) {
		if (flag) {
			while (tr!=br+1) {
				System.out.print(A[tr++][tc--]+" ");
			}
		}else {
			while (br!=tr-1) {
				System.out.print(A[br--][bc++] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for (int i = 0; i < A.length; i++) {
			System.out.println(Arrays.toString(A[i]));
		}
		printZigZag(A);
	}

}
