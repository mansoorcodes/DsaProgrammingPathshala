package M2GearingUp.Recursion.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

// this is GFG comments soln I stole this code
// I had similar kind of approach but it's not working for me... !!! fuck...!!

class _3_HW_TowerOfHanoi_GFG_Guys_Soln{
    static int n1,n2,k;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfPiles = scn.nextInt();
        int moveNumber = scn.nextInt();
        System.out.println(shiftPile(noOfPiles, moveNumber));
    }
    static void solve(int N, int a, int c, int b, int l){
        if(N==0) return;
        solve(N-1,a,b,c,l);
        k++;
        if(k==l){ // l is no of moves that i want to make and return
            n1 = a;
            n2 = c;
            return;
        }
        solve(N-1,b,c,a,l);
    }
    static List<Integer> shiftPile(int N, int n){
        // code here
        k=0;
        solve(N,1,3,2,n);
//        return Arrays.asList(n1,n2);
        List ans = new ArrayList<Integer>();
        ans.add(n1);
        ans.add(n2);
        return ans;
    }
}