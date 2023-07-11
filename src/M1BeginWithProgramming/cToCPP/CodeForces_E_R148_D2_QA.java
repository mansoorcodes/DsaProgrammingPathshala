package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class CodeForces_E_R148_D2_QA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            String palin = scn.next();
            System.out.println(isPalinPossible(palin)? "YES": "NO");
        }
    }

    private static boolean isPalinPossible(String palin) {
        int len = palin.length();
        for (int i = 1; i <= len/2 -1; i++) {
            System.out.println("compare : "+palin.charAt(i-1)+" "+palin.charAt(i));
            if(palin.charAt(i) != palin.charAt(i-1)) return true;
        }
        return false;
    }
}
