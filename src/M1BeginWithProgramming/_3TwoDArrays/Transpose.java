package M1BeginWithProgramming._3TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] [] arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("\nBefore Transpose:");
        for(int i = 0; i<n; i++){
            System.out.print(Arrays.toString(arr[i])+"\n");
        }
        //transpose
        for(int i=1; i<n; i++){
            for(int j =0; j<i;j++){
                swap(arr, i,j, j,i);
            }
        }
        System.out.println("\nAfer Transpose:");
        for(int i = 0; i<n; i++){
            System.out.print(Arrays.toString(arr[i])+"\n");
        }


    }
    public static void swap(int[][] arr, int i, int j, int x, int y){
        int temp = arr[i][j];
        arr[i][j] = arr[x][y];
        arr[x][y] = temp;
    }
}
