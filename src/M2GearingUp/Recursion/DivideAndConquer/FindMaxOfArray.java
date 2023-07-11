package M2GearingUp.Recursion.DivideAndConquer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }

        Arrays.fill(arr, 20);
        // find using divide and conquer
//        int[] total
        System.out.println(findMaxUsingDivideAndConquer(arr, 0, n-1, 0));
    }

    private static int findMaxUsingDivideAndConquer(int[] arr, int b, int e, int height) {
        if(b == e) {
            System.out.println(height);
            return arr[b];
        }
        int half = (b+e)/2;
        int leftMax = findMaxUsingDivideAndConquer(arr, b, half, height+1);
        int rightMax = findMaxUsingDivideAndConquer(arr, half+1, e, height+1);
        return Math.max(leftMax, rightMax);
    }
}
