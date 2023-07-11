package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                arr[r][c] = scn.nextInt();
            }
        }

        // core logic in-Place Algo
        for (int i = 0; i < n/2; i++) {
            int blr = n-1-i, blc = i;
            int tlr = i, tlc = i;
            int trr = i, trc = n-1-i;
            int brr = n-1-i, brc = n-1-i;
            int targetRow = tlr;
            for (int j = blr; j > targetRow ; j--) {
                int temp = arr[blr][blc];
                arr[blr][blc] = arr[brr][brc];
                arr[brr][brc] = arr[trr][trc];
                arr[trr][trc] = arr[tlr][tlc];
                arr[tlr][tlc] = temp;
                blr--;
                tlc++;
                trr++;
                brc--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(arr[i])+",");
        }
    }
}
