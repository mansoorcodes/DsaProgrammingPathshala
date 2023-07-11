package M2GearingUp.ArraysArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralTraversal_2 {
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
        System.out.println(spiralOrder(arr));
        int maxElem = (arr.length*arr[0].length);
        int cnt = 0;
        System.out.println(maxElem);
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        // traversal
        // TL && BR defines the boundary
        // T, B are rows idx
        // R, L are cols idx
        int T = 0, B = arr.length-1;
        int L = 0, R = arr[0].length-1;
        // Count no of elements traversed and break if we print all...
        // EASY
        int maxElem = (arr.length*arr[0].length);
        int cnt = 0;
        while (cnt<maxElem){
            // top row
            for (int j = L; j <= R && cnt<maxElem; j++) {
                list.add(arr[T][j]);
                cnt++;
            }
            T++;
            // Right Col
            for (int i = T; i <= B && cnt<maxElem; i++) {
                list.add(arr[i][R]);
                cnt++;
            }
            R--;
            // Bottom Row
            for (int j = R; j >= L && cnt<maxElem; j--) {
                list.add(arr[B][j]);
                cnt++;
            }
            B--;
            // Left Col
            for (int i = B; i >= T && cnt<maxElem; i--) {
                list.add(arr[i][L]);
                cnt++;
            }
            L++;
        }
        return list;
    }
}
