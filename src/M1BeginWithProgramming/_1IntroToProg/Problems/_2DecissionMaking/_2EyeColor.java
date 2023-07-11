package M1BeginWithProgramming._1IntroToProg.Problems._2DecissionMaking;

import java.util.Scanner;

/*
problem link
https://www.codechef.com/problems/GENE01
 */
public class _2EyeColor {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        char c1 = scn.next().charAt(0), c2 = scn.next().charAt(0);

        mySolution(c1, c2);
        // Most optimised or elegant code
        optimisedSolution(c1, c2);

    }

    private static void optimisedSolution(char c1, char c2) {
        if(c1=='R' || c2=='R') System.out.println("R");
        else if(c1=='B' || c2=='B') System.out.println("B");
        else System.out.println("G");
    }

    private static void mySolution(char c1, char c2) {
        if((c1=='R') && (c2=='B' || c2 =='G') || (c1 =='B' || c1=='G') && (c2 =='R') ||c1=='R' && c2=='R'){
            System.out.println("R");
        }else if(c1=='B' && c2=='G' || c1=='G' && c2=='B' || c1=='B'&&c2=='B') {
            System.out.println("B");
        }else{
            System.out.println("G");
        }
    }

}
