package M1BeginWithProgramming._3TwoDArrays;

import java.util.Scanner;

public class UpperLowerTriMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        int [][] arr;
        int n = 5;
        arr = new int[][]{
                {1, 3, 2, 56, 21},
                {45,8, 0, 23, 1},
                {4,9,2, 1, 56},
                {-1, 40, -6, -2, -7},
                {-49, 2, 87, 1, 0}
        };

        for(int i = 0; i< n; i++){ // upper triangle of a matrix.
            for(int sp = 0; sp<i; sp++){ // first print spaces then elements
                System.out.print("\t");
            }
            for(int j = i; j<n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
