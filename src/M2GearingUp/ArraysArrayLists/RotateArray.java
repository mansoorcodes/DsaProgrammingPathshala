package M2GearingUp.ArraysArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        k = k % n; // change k to valid minimum rotations.
        // logic is reverse last k elem, & first n-k elem and last reverse whole array
        reverseArray(arr, 0, n-1-k);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int lIdx, int rIdx) {
        while (lIdx < rIdx){
            int temp = arr[lIdx];
            arr[lIdx] = arr[rIdx];
            arr[rIdx] = temp;
            lIdx++;
            rIdx--;
        }
    }
}
