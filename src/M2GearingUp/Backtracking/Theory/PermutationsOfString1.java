package M2GearingUp.Backtracking.Theory;

import java.util.Scanner;

public class PermutationsOfString1 {
    static int cntOfPermutations; // this is for testing purpose only
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.next());
        cntOfPermutations = 0;
        printAllPermutationsUsingBacktracking(sb, 0);
        System.out.println(cntOfPermutations);
    }

    private static void printAllPermutationsUsingBacktracking(StringBuilder sb, int idx) {
        if(idx == sb.length()-1){
            cntOfPermutations++;
            System.out.println(sb);
            return;
        }
        for (int i = idx; i < sb.length(); i++) {
            swap(idx, i, sb);
            printAllPermutationsUsingBacktracking(sb, idx+1);
            swap(idx, i, sb);
        }
    }

    private static void swap(int idx, int i, StringBuilder sb) {
        char ch = sb.charAt(idx);
        sb.setCharAt(idx, sb.charAt(i));
        sb.setCharAt(i, ch);
    }
}
