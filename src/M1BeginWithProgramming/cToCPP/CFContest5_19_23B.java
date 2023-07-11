package M1BeginWithProgramming.cToCPP;

import java.util.Arrays;
import java.util.Scanner;

public class CFContest5_19_23B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            int [] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            int [] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scn.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (Math.abs(a[i]-b[i]) <= k) continue;
                for (int j = i+1; j < n; j++) {
                    if(Math.abs(a[i]-b[j]) > k) continue;
                    else{
                        swap(b, i, j);
                        break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
