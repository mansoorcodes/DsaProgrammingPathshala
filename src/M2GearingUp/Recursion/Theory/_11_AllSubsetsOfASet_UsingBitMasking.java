package M2GearingUp.Recursion.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _11_AllSubsetsOfASet_UsingBitMasking {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printAllSubSetsBitMasking(arr, n);
    }

    public static void printAllSubSetsBitMasking(int[] arr, int n) {
        int lastBit = (int)Math.pow(2,n);
        System.out.println(lastBit);
        ArrayList<Integer> ans;
        for (int i = 0; i < lastBit; i++) {
            ans = new ArrayList<>();
            int [] bitMask = generateBits(i, n);
            for (int j = 0; j < n; j++) {
                if(bitMask[j] == 1) {
                    int elem = arr[j];
                    ans.add(elem);
                }
            }
            System.out.println(ans);
        }
    }

    public static int[] generateBits(int num, int size) {
        int [] bitMask = new int[size];
        int idx = size-1;
        int temp = num;
        while (temp != 0){
            if(temp %2 ==1){
                bitMask[idx] = temp % 2;
            }
            temp /= 2;
            idx--;
        }
        return bitMask;
    }
}
