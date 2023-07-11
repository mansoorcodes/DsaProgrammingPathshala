package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class TheUltimateSquare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            System.out.println((n+1)/2);
        }
    }
}
