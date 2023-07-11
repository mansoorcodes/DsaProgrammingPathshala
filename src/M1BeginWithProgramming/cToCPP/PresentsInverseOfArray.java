package M1BeginWithProgramming.cToCPP;

import java.util.Arrays;
import java.util.Scanner;

public class PresentsInverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int receiver = arr[i];
            int receiverGivenTo = arr[receiver -1];
            ans[receiverGivenTo -1] = receiver;
        }
        System.out.println(Arrays.toString(ans));
    }
}
