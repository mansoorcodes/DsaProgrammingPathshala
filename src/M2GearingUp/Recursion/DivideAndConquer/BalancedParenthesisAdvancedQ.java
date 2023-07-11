package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class BalancedParenthesisAdvancedQ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        // aditya verma method of minus not plus
        char[] str = new char[m+m+n+n];
        printParenthesisAdvanced(n, n, m, m, 0, str);
    }

    private static void printParenthesisAdvanced(int l1, int r1, int l2, int r2, int idx, char[] str) {
        // base case
        if(l1 == 0 && l2 == 0 && r1 == 0 && r2 == 0){
            for (char ch: str) {
                System.out.print(ch);
            }
            System.out.println();
            return;
        }
        // case '('
        if(l1 != 0){
            str[idx] = '(';
            printParenthesisAdvanced(l1-1, r1, l2, r2, idx+1, str);
        }
        // case ')'
        // jagratha
//        if(r1 > l1){
//            int counterIdx = (str.length - idx -1);
//            // we are checking all counterparts, but they might be in future indices
//            // i.e., ==> inside ') counter: 4 idx: 1 <== this is happening &
//            // we are checking the parts in the later parts of string
//            // eg: " ( _ _ _ _ _ "
//            // here idx == 1, but we are checking for (counterIdx == 4) that counterIdx has counter part
//            // but we must not check the parts of future, those we are yet to update
//            // at the end do this -->
//            // if(counterIdx < idx)
//            // System.out.println("inside ') "+"counter: "+counterIdx+" "+"idx: "+idx);
//
//            if(counterIdx >= idx || str[counterIdx] == '('){
//                str[idx] = ')';
//                printParenthesisAdvanced(l1, r1-1, l2, r2, idx+1, str);
//            }
//        }
        // case '{'
        if(l2 != 0){
            str[idx] = '{';
            printParenthesisAdvanced(l1, r1, l2-1, r2, idx+1, str);
        }
        // case '}'
//        if(r2 > l2){
//            int counterIdx = (str.length - idx -1);
//
//            System.out.println("inside '} "+"counter: "+counterIdx+" "+"idx: "+idx);
//
//            if(counterIdx >= idx || str[counterIdx] == '{'){
//                str[idx] = '}';
//                printParenthesisAdvanced(l1, r1, l2, r2-1, idx+1, str);
//            }
//        }

        // case ')' / '}' // by Student in PPA
        if(true){
            int OP = 0, CP = 0, OB = 0, CB = 0;
            for (int j = idx-1; j >= 0; j--)
            {
                if (OP > CP || OB > CB)
                    break;
                if (str[idx] == '(')
                    OP++;
                else if (str[idx] == ')')
                    CP++;
                else if (str[idx] == '{')
                    OB++;
                else if (str[idx] == '}')
                    CB++;
            }
            if (OP > CP)
            {
                str[idx]=')';
                printParenthesisAdvanced(l1, r1-1, l2, r2, idx+1, str);
            }
            else if(OB > CB)
            {
                str[idx]='}';
                printParenthesisAdvanced(l1, r1, l2, r2-1, idx+1, str);
            }
        }
    }
}
