import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public int numSquares(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int value[][] = new int[matrix.length * matrix[0].length][3];
        // [value,i,j]
        int matrix_tmp[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                int tmp[] = new int[3];
                tmp[0] = matrix[i][j]; tmp[1] = i; tmp[2] = j;
                value[i * matrix[0].length + j] = tmp;
                matrix_tmp[i][j] = 0;
            }
        }

        Arrays.sort(matrix, (x, y) -> x[0] > y[0] ? -1 : 1);
        int maxValue = 0;
        for (int i = 0; i < value.length; i++) {
            int a = value[i][1]; int b = value[i][2];
            matrix_tmp[a][b] = 1;
            if (a < matrix.length -1 && matrix[a][b] < matrix[a + 1][b])
                matrix_tmp[a][b] = Math.max(matrix_tmp[a][b], matrix_tmp[a + 1][b] + 1);
            if (b < matrix[0].length - 1 && matrix[a][b] < matrix[a][b + 1] )
                matrix_tmp[a][b] = Math.max(matrix_tmp[a][b], matrix_tmp[a][b+ 1] + 1);
            if (a > 0 && matrix[a][b] < matrix[a - 1][b] )
                matrix_tmp[a][b] = Math.max(matrix_tmp[a][b], matrix_tmp[a - 1][b] + 1);
            if (b  > 0 && matrix[a][b] < matrix[a][b - 1])
                matrix_tmp[a][b] = Math.max(matrix_tmp[a][b], matrix_tmp[a][b - 1] + 1);
            if (matrix_tmp[a][b] > maxValue) maxValue = matrix_tmp[a][b];
        }
        return maxValue;
    }

    public static void main(String ag[]) {
//        int a[][] = {{32, 34, 7, 33, 21, 2},
//                {13, 12, 3, 11, 26, 36},
//                {16, 30, 22, 1 ,24, 14},
//                {20, 23 ,25, 5 ,19, 29},
//                {27, 15, 9, 17, 31, 4},
//                {6, 18, 8, 10, 35, 28}};
    	 Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();
         int col = sc.nextInt();
         int[][] matrix = new int[row][col]; 
         for (int i = 0; i< row; i++) {
             for (int j = 0; j < col; j++) {
                 matrix[i][j] = sc.nextInt();
             }
         }
        System.out.println(new Solution().numSquares(matrix));
    }
}