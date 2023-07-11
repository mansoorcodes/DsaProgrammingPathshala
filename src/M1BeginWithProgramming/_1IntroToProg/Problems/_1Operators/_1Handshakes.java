package M1BeginWithProgramming._1IntroToProg.Problems._1Operators;

import java.util.Scanner;

public class _1Handshakes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println((long)(n)*(n-1)/2);
    }
}
