package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class WayTooLongWords {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        scn.nextLine();
        //ansWithSB(n);
        ansWithStr(n);
    }

    private static void ansWithStr(int n) {
        while (n-- >0){
            String word = scn.nextLine();
            int len = word.length();
            if(len > 10){
                word = ""+word.charAt(0) + (len - 2) + word.charAt(len - 1);
            }
            System.out.println(word);
        }
    }

    private static void ansWithSB(int n) {
        while (n-- >0){
            StringBuilder word = new StringBuilder(scn.nextLine());
            int len = word.length();
            if(len > 10){
                word = new StringBuilder(""+word.charAt(0) + (len - 2) + word.charAt(len - 1));
            }
            System.out.println(word);
        }
    }
}
