package M1BeginWithProgramming._1IntroToProg.Problems._1Operators;

import java.util.Scanner;

public class _2FindPoint {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        /* after drawing in paper formula is obtained*/
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        System.out.print(x2+ (x2-x1) + " ");
        System.out.print(y2+ (y2-y1) + " ");

    }
}
