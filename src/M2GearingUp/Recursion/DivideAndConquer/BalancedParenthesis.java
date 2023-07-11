package M2GearingUp.Recursion.DivideAndConquer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // ArrayList
        ArrayList<String> ans = new ArrayList<>();
        char[] str = new char[2*n];
        // printParenthesis(n, 0, 0, 0, str, ans); // this logic is by vivekam
        printParenthesis_2(n, 0, 0, 0, str, ans);
        for (String par: ans) {
            System.out.println(par);
        }
    }

    private static void printParenthesis_2(int n, int l, int r, int idx, char[] str, ArrayList<String> ans) {
        // my logic inspired by Aditya Verma
//        if(l +r == 2*n){
//            ans.add(Arrays.toString(str));
//            return;
//        }

        if(l +r == 2*n){
            // in leetcode Arrays.toString(str) is giving unnecessary Commas,,,.!!!
            StringBuilder sb = new StringBuilder();
            for(char ch: str){
                sb.append(ch);
            }
            ans.add(sb.toString());
            return;
        }

        // case '('
        if(l == r || (l>r && l != n)){
            str[idx] = '(';
            printParenthesis_2(n, l+1, r, idx+1, str, ans);
        }
        // case ')'
        if((l>r) && l == n || (l>r) && l != n){
            // simplify to if (l>r)
            str[idx] = ')';
            printParenthesis_2(n, l, r+1, idx+1, str, ans);
        }
    }

    private static void printParenthesis(int n, int l, int r, int idx, char[] str, ArrayList<String > ans) {
        // Vivekam Logic
        if(l +r == 2*n){
            ans.add(Arrays.toString(str));
            return;
        }
        // case 1
        if(l == r){
            str[idx] = '(';
            printParenthesis(n, l+1, r, idx+1, str, ans);
        }
        // case 2
        else if (l > r) {
            if(l == n){
                str[idx] = ')';
                printParenthesis(n, l, r+1, idx+1, str, ans);
            }else {
                str[idx] = '(';
                printParenthesis(n, l+1, r, idx+1, str, ans);
                str[idx] = ')';
                printParenthesis(n, l, r+1, idx+1, str, ans);
            }
        }
    }
}
