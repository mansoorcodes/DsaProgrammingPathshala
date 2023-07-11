package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Before bubble sort: "+ Arrays.toString(arr));
        for(int x = 1; x<= n-1; x++){ // x-th bubbling
            for(int i = 0; i<= n-2; i++){
                if(arr[i] > arr[i+1]) swap(arr, i, i+1);
            }
        }
        System.out.println("After bubble sort: "+ Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
