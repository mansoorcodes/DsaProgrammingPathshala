package M2GearingUp.ArraysArrayLists;

import java.util.Scanner;

public class MajorityElement_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        // usingExtraArray(arr, n);
        // Moore's voting algo
        // arr[candidate] > n/2 works here
        // b/c half elements cancel other half and one remains in the minimum case
        mooresVotingAlgo(arr,n);
    }

    private static void mooresVotingAlgo(int[] arr, int n) {
        int candidate = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[candidate] == arr[i]){
                count++;
            }else {
                count--;
            }
            if(count == 0){// here our candidate lost for now nominate next candidate
                candidate = i;
                count++;
            }
        }
        System.out.println(arr[candidate]);
        // we traverse one more time to check our last eligible candidate is mahority or not
        // in this Leetcode Q we are guarenteed of majority element
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[candidate] == arr[i]) cnt++;
        }
        if(cnt> n/2) System.out.println(arr[candidate]);
    }

    private static void usingExtraArray(int[] arr, int n) {
        int [] freq = new int[101];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= 100 ; i++) {
            if(freq[i] > n/2){
                System.out.println(i);
                break;
            }
        }
    }
}
