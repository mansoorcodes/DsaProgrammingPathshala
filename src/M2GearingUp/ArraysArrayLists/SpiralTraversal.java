package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int [][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // traversal
        // TL && BR defines the boundary
        // T, B are rows idx
        // R, L are cols idx
        int T = 0, B = rows-1;
        int L = 0, R = cols-1;
        while (T<=B && L<=R){
            // top row
            for (int j = L; j <= R && T<=B && L<=R; j++) {
                System.out.print(arr[T][j]+" ");
            }
            T++;
            // Right Col
            for (int i = T; i <= B && T<=B && L<=R; i++) {
                System.out.print(arr[i][R]+" ");
            }
            R--;
            // Bottom Row
            for (int j = R; j >= L && T<=B && L<=R; j--) {
                System.out.print(arr[B][j]+" ");
            }
            B--;
            // Left Col
            for (int i = B; i >= T && T<=B && L<=R; i--) {
                System.out.print(arr[i][L]+" ");
            }
            L++;
        }
    }
}
