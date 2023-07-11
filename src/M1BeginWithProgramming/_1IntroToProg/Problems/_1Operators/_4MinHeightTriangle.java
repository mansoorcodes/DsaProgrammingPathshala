package M1BeginWithProgramming._1IntroToProg.Problems._1Operators;

import java.util.Scanner;

public class _4MinHeightTriangle {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int a = scn.nextInt();
        System.out.println((int)Math.ceil((float)(2*a)/b));
    }
}
