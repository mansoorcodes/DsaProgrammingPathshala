package KunalKushwaha.Arrays.CycliSort;
/*
8
5 2 7 4 8 1 3 6
[1, 2, 3, 4, 5, 6, 7, 8]
 */

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0, n = arr.length;
        while (i<n){
            int correctIdx = arr[i]-1;
            if(arr[correctIdx] != arr[i]) swap(arr, i, correctIdx);
            else i++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
