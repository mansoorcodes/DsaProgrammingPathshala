package M2GearingUp.Math.Problems;

import java.util.Scanner;

/* package codechef; // don't place package name! */
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class EquallyDistributedGroups
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        // my previous code is Dumb and Not works...
        // for [2,2,2,2,4,4,6,6,8,8] ...
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            int [] arr = new int[n];
            int [] freq = new int [10005];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                freq[arr[i]]++;
            }
            if(n == 1) {
                System.out.println("false");
                continue;
            }
            int gcd = gcd(freq[0], freq[1]);
            for (int i = 2; i < 10005; i++) {
                gcd = gcd(gcd, freq[i]);
            }
            System.out.println(gcd >= 2? "true": "false");
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