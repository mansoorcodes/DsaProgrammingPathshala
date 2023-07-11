package M1BeginWithProgramming.cToCPP;

import java.util.Arrays;
import java.util.Scanner;

public class CodeForces_E_R148_D2_QB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int len = scn.nextInt();
            int rounds = scn.nextInt();
            int [] arr = new int[len];
            long totalArraySum = 0;
            for (int i = 0; i < len; i++) {
                arr[i] = scn.nextInt();
                totalArraySum += arr[i];
            }
            Arrays.sort(arr);
            int ans = 0;
            long deletedUptoNow = 0;
            long origSum = totalArraySum;
            System.out.println(correctCodeUsingRecursion(arr, rounds, origSum, deletedUptoNow, ans));

        }
    }

    private static long correctCodeUsingRecursion(int[] arr, int rounds, long origSum, long deletedUptoNow, long ans) {
        if(rounds == 0){
            long ansOfRound = origSum - deletedUptoNow;
            if(ans > ansOfRound){
                ans = ansOfRound;
            }
            return ans;
        }
        long choseMin = correctCodeUsingRecursion(arr, rounds--, origSum, (arr[rounds -1]+arr[rounds]) , ans);
        long choseMax = correctCodeUsingRecursion(arr, rounds--, origSum, arr[arr.length - rounds], ans);
        if(choseMax > choseMin) return choseMax;
        else return choseMin;

    }

    public static void wrongCode(int [] arr , int len, int rounds, int totalArraySum){
        int minIdx = 0, maxIdx = len-1;
        int minSum = 0, maxSum = 0;
        long totalDeletedSum = 0;
        for (int i = 0; i < rounds; i++) {
            minSum = arr[minIdx] + arr[minIdx+1];
            maxSum = arr[maxIdx];
            if(minSum< maxSum){
                System.out.println("delete min: "+arr[minIdx]+" "+arr[minIdx+1]);
                minIdx+= 2;
                totalDeletedSum += minSum;
            }else{
                System.out.println("delete max: "+arr[maxIdx]);
                maxIdx --;
                totalDeletedSum += maxSum;
            }
        }
        System.out.println(totalArraySum - totalDeletedSum);
    }
}
