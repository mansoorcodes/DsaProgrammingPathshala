package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;


public class MatrixBlockSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // pre computation prefix sum of matrices
        // psum[][] rows sum.
        for(int i = 0; i<m; i++){
            for(int j = 1; j<n; j++){
                arr[i][j] = arr[i][j-1] + arr[i][j];
            }
        }
        // psum[][] column sum --> here matrix sum
        for(int j = 0; j<n; j++){
            for(int i = 1; i<m; i++){
                arr[i][j] = arr[i-1][j] + arr[i][j];
            }
        }
        // traverse new answer matrix
        int [][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // defining TopLeft
                int i1 = (i<k)? 0: i-k;
                int j1 = (j<k)? 0: j-k;
                // defining BottomRight
                int i2 = ((i+k)>= m)? m-1: i+k;
                int j2 = ((j+k)>= n)? n-1: j+k;
                int sum = getSum(arr, i1, j1, i2, j2);
                ans[i][j] = sum;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int getSum(int[][] arr, int i1, int j1, int i2, int j2) {
        int sum = 0;
        sum = arr[i2][j2];
        sum -= (i1>0? arr[i1-1][j2]: 0);
        sum -= (j1>0? arr[i2][j1-1]: 0);
        sum += (i1>0 && j1>0? arr[i1-1][j1-1]: 0);
        return sum;
    }
}
