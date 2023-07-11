package  M1BeginWithProgramming.cToCPP;

import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(howMuchTimeWithBubbleSwap(arr)); // this also working
        System.out.println(ans(arr)); // this also working
        // YES FUCKING WORKING BOTH YES...

    }

    private static int ans(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                // this logic gets first max value in arr
                max = arr[i];
                maxIdx = i;
            }
            if(arr[i] <= min){
                // this logic gets last min value in arr
                min = arr[i];
                minIdx = i;
            }
        }
        return (minIdx<maxIdx ? (arr.length-1) - minIdx + maxIdx -1 : (arr.length-1) - minIdx + maxIdx);
    }

    private static int howMuchTimeWithBubbleSwap(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                // this logic gets first max value in arr
                max = arr[i];
                maxIdx = i;
            }
            if(arr[i] <= min){
                // this logic gets last min value in arr
                min = arr[i];
                minIdx = i;
            }
        }
        System.out.println("Max = "+ max +" "+maxIdx+" Min = "+min+" "+minIdx);
        int time = 0;
        while (minIdx != arr.length-1 || maxIdx != 0){
            if(maxIdx != 0) {
                boolean flag = false;
                if(maxIdx -1 == minIdx) flag = true;
                int temp = arr[maxIdx];
                arr[maxIdx] = arr[maxIdx -1];
                arr[maxIdx -1] = temp;
                maxIdx--;
                time++;
                if(flag) minIdx++;
                System.out.print("Swapped! =>MaxValue is = "+arr[maxIdx] + " MaxIDX = "+maxIdx+ " time = "+time);
                System.out.print(Arrays.toString(arr)+"\n");
            }
            if(minIdx != arr.length-1) {
                boolean flag = false;
                if(minIdx +1 == maxIdx) flag = true;
                int temp = arr[minIdx];
                arr[minIdx] = arr[minIdx+1];
                arr[minIdx+1] = temp;
                minIdx++;
                time++;
                if(flag) maxIdx--;
                System.out.print("Swapped! =>MinValue is = "+arr[minIdx] +" MinIDX = "+minIdx+ " time = "+time);
                System.out.print(Arrays.toString(arr)+"\n");
            }
        }
        System.out.println(Arrays.toString(arr));
        return time;
    }

    public static void howMuchTimeWithExtremeSwap(int [] arr){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIdx = i;
            }
        }
        System.out.println("max = "+ max+" "+maxIdx+" min = "+ min+" "+minIdx);
        int time = 0;

        if(arr[0] != max) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[0];
            arr[0] = temp;
            time++;
        }
        if(arr[arr.length-1] != min) {
            int temp = arr[minIdx];
            arr[minIdx] = arr[arr.length-1];
            arr[arr.length-1] = temp;
            time++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(time);
    }
}
