package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Before Insertion sort: "+ Arrays.toString(arr));
        for(int SortedArrSize = 1; SortedArrSize<n; SortedArrSize++){
            int j = SortedArrSize;
            while(j>0 && arr[j] < arr[j-1]){ // here imp thing J>0 check should be before (arr[j] < arr[j-1]) if not arr index out of bound.
                swap(arr, j, j-1);
                j--;
            }
        }


        System.out.println("After Insertion sort: "+ Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
