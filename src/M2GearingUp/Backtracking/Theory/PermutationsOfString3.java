package M2GearingUp.Backtracking.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationsOfString3 {
    // repetitions are there...
    static int cntOfPermutations; // testing purpose
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.next());
        char [] chArr = new char[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            chArr[i] = sb.charAt(i);
        }
        Arrays.sort(chArr);
        for (int i = 0; i < chArr.length; i++) {
            sb.setCharAt(i, chArr[i]);
        }
        cntOfPermutations = 0;
        // printAllPermutationsUsingBacktracking3(sb, 0);
        printAllPermutationsUsingBacktracking3UsingVivekamRotate(sb, 0);
        System.out.println(cntOfPermutations);
    }

    private static void printAllPermutationsUsingBacktracking3UsingVivekamRotate(StringBuilder sb, int idx) {
        if(idx == sb.length()-1){
            cntOfPermutations++;
            System.out.println(sb);
            return;
        }
        char prev = sb.charAt(idx);
        for (int i = idx; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            rightRotate(idx, i, sb);
            if(i == idx || (i != idx && prev != curr)) printAllPermutationsUsingBacktracking3UsingVivekamRotate(sb, idx+1);
            leftRotate(idx, i, sb);
            prev = curr;
        }
    }

    private static void leftRotate(int idx, int i, StringBuilder sb) {
        char temp = sb.charAt(idx);
        for (int k = idx; k <= i-1; k++) {
            sb.setCharAt(k, sb.charAt(k+1));
        }
        sb.setCharAt(i, temp);
    }

    private static void rightRotate(int idx, int i, StringBuilder sb) {
        char temp = sb.charAt(i);
        for (int k = i; k >= idx+1; k--) {
            sb.setCharAt(k, sb.charAt(k-1));
        }
        sb.setCharAt(idx, temp);
    }







    private static void printAllPermutationsUsingBacktracking3(StringBuilder sb, int idx) {
        if(idx == sb.length()-1){
            cntOfPermutations++;
            System.out.println(sb);
            return;
        }
        swap(idx, idx, sb);
        printAllPermutationsUsingBacktracking3(sb, idx+1);
        swap(idx, idx, sb);
        int cnt = 2;

        char prev = sb.charAt(idx+1);
        for (int i = idx+1; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            if(curr == prev) {
                i++;
                cnt++;
            }
            else {
                // this eventually became complex because I was performing
                // some repeated redundant calculations in my previous problem...
                // so let me do it in VIVEKAM way...!
                // left rotate Right rotate...
                swap(idx, i, sb);
                cnt++;
                if(cnt > 2) shiftRight(sb, i, idx);
                printAllPermutationsUsingBacktracking3(sb, idx+1);
                if(cnt > 2) shiftLeft(sb, i, idx);
                swap(idx, i, sb);
            }
            prev = curr;
        }
    }
    private static void shiftLeft(StringBuilder sb, int i, int idx) {
        // this func places idx+1 at i and shifts everything to left... in between
        char ch = sb.charAt(idx +1);
        for (int j = idx+1; j <= i-1; j++) {
            char temp = sb.charAt(j+1);
            sb.setCharAt(j, temp);
        }
        sb.setCharAt(i, ch);
    }

    private static void swap(int idx, int i, StringBuilder sb) {
        char ch = sb.charAt(idx);
        sb.setCharAt(idx, sb.charAt(i));
        sb.setCharAt(i, ch);
    }

    private static void shiftRight(StringBuilder sb, int i, int idx){
        // this func places i at idx+1 and shifts everything right... in between
        char ch = sb.charAt(i);
        for (int j = i; j >= idx+2; j--) {
            char temp = sb.charAt(j-1);
            sb.setCharAt(j, temp);
        }
        sb.setCharAt(idx+1, ch);
    }
}
