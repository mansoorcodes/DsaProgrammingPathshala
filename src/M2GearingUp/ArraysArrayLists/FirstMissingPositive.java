package M2GearingUp.ArraysArrayLists;

import java.util.HashMap;
import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- >0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr [i] = scn.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            if (min >1) {
                System.out.println(1);
                continue;
            }
            // bruteForce(arr);
//            HashMap<Integer,Integer> mp = new HashMap<>();
//            for (int i = 0; i < n; i++) {
//                mp.put(arr[i], 1);
//            }
            // System.out.println(mp);
            // useHashMap(arr, mp);
            // O(n)

            // I tried so hard but it does't matter FUCK I'm not getting answer!!!///...
            int maxPosAns = n+2;
            int invalid = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] < 1 || arr[i] > maxPosAns){
                    invalid++;
                    maxPosAns--;
                }
            }
            int lastIdx = n-1;
            for (int i = 0; i < n; i++) {
                int elem = arr[i];
                if(arr[i] != i-1) arr[i] = Integer.MIN_VALUE;
                int nextIdx = 0;
                while (true){
                    if(elem <1 || elem > maxPosAns){
                        nextIdx = arr[lastIdx];
                        arr[lastIdx] = elem;
                        lastIdx--;
                        elem = nextIdx;
                        if(elem == Integer.MIN_VALUE )break;
                        if(nextIdx<n && nextIdx >=0 && nextIdx == arr[nextIdx-1]) break;
                    } else if (elem < maxPosAns) {
                        if(elem >=0 && elem <n && elem == arr[elem - 1]){
                            invalid++;
                            maxPosAns--;
                            break;
                        }
                        nextIdx = arr[elem-1];
                        arr[elem -1] = elem;
                        elem = nextIdx;
                        if(elem == Integer.MIN_VALUE) break;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if(arr[i] == i+1) continue;
                else {
                    System.out.println(i+1);
                    break;
                }
            }








        }
    }

    private static void useHashMap(int[] arr,HashMap<Integer,Integer> mp) {
        int n = arr.length;
        for (int i = 1; i <= n+1; i++) {
            if(!mp.containsKey(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static void bruteForce(int[] arr) {
        // need to check the correctness of this seems to be inconsistent.
        int n = arr.length;
        for (int i = 1; i <= n+1; i++) {
            if(!checkElem(i ,arr)) {
                System.out.println(i);
                break;
            }
        }
    }
    private static boolean checkElem(int i, int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            if(arr[j] == i) return true;
        }
        return false;
    }
}
