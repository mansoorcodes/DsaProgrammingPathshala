package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Before Sorting: "+Arrays.toString(arr));

        for(int i = 0; i< n; i++){ // also can be (i< n-1)
            int min = Integer.MAX_VALUE;
            int minidx = 0;
            for(int j = i; j< n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minidx = j;
                }
            }
            // swap a[i] and a[minidx];
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        System.out.println("After Sorting: "+Arrays.toString(arr));

//        for(int i = 0; i<= n-2; i++){
//            int minidx = i;
//            for(/*int j = i+1*/ int j = i; j<= n-1; j++){
//                /*if(arr[j] < arr[i]){ // minumin in an array is not this logic!!
//                    minidx = j;
//                }*/
//                if(arr[j] < Integer.MAX_VALUE){
//                    minidx = j;
//                }
//            }
//            // swap
//            int temp = arr[i];
//            arr[i] = arr[minidx];
//            arr[minidx] = temp;
//        }
//        System.out.println("After Sorting: "+Arrays.toString(arr)); // This is fundamentally wrong algorithm.in many ways!!!!!
    }
}
