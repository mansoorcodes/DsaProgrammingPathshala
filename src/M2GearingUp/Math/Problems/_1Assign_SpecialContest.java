package M2GearingUp.Math.Problems;

/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class _1Assign_SpecialContest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        // consider int overflows...
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            long n = scn.nextLong();
            int A = scn.nextInt(), B = scn.nextInt();
            Long K = scn.nextLong();
            long lcm = (long) A* B/gcd(A, B);
            // formula is multiples of A+ multi of B - 2* multi of lcm(A,B);
            long problemsSolved = (n/A) + (n/B) - 2*(n/lcm);
            if(problemsSolved >= K) System.out.println("Win");
            else System.out.println("Lose");
        }
    }
    private static int gcd(int a, int b) { // returns gcd of 2 numbers...
        int divisor = Math.min(a, b);
        int dividend = Math.max(a, b);
        if(divisor == 0) return dividend;
        while (true){
            int rem = dividend % divisor;
            if(rem == 0) return divisor;
            dividend = divisor;
            divisor = rem;
        }
    }
}