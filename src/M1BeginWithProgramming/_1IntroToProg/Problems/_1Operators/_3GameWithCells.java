package M1BeginWithProgramming._1IntroToProg.Problems._1Operators;

import java.util.Scanner;

public class _3GameWithCells {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        //for every 4 squares 1 pkg is rqrd, by drawing and finding
        Scanner scn = new Scanner(System.in);
        double row = scn.nextInt();
        double col = scn.nextInt();
        System.out.println((int)(Math.ceil(row/2) * Math.ceil(col/2)));
    }
}
