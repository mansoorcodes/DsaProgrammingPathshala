package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
         Categorised into
         1) Perfect Palindromes (all chars are same)
         2) Imperfect Palindromes.
        */
        int t = scn.nextInt();
        while (t-- >0){
            String palin = scn.next();
            boolean isPerfect = true;
            int len = palin.length();
            char letter = palin.charAt(0);
            for (int i = 1; i < len; i++) {
                char ch = palin.charAt(i);
                if(letter != ch){
                    isPerfect = false;
                    break;
                }
            }
            if(isPerfect) System.out.println(-1);
            else System.out.println(len - 1);
        }
    }
}
