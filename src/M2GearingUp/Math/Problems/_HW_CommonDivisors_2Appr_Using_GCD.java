package M2GearingUp.Math.Problems;
/**
 Hello sir,
 My code passes all the test cases when I take spf[10^7] but according to the constraints
 A, and B can be 10^9 and when we take the array for spf[10^9] it shows a memory error
 How we can handle such things when the range is too large and we need to create SPF for
 Approach
 // first we need to find the GCD of A and B
 // then we need to find out the total number of divisors in GCD using spf
 */

 // Wow LOGIC.....

import java.util.*;
import java.lang.*;
import java.io.*;

public class _HW_CommonDivisors_2Appr_Using_GCD
{
    private static int spf[] = new int[10000000];
    public static void main (String[] args) throws java.lang.Exception
    {
        initSpf();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i<t ; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = findGcd(a,b);
            int divisors = findTotalDivisor(gcd);
            System.out.println(divisors);
        }
    }
    public static int findTotalDivisor(int n)
    {
        int answer = 1;
        int count;
        while(spf[n] != 0)
        {
            count = 0;
            int x = spf[n];
            while(n % x == 0)
            {
                n = n/x;
                count++;
            }
            count++;
            answer*= count;
        }
        return answer;
    }
    public static int findGcd(int a,int b)
    {
        int max = Integer.max(a,b);
        int min = Integer.min(a,b);
        while(true)
        {
            int rem = max % min;
            if(rem == 0)
                return min;
            max = min;
            min = rem;
        }
    }
    public static void initSpf()
    {
// this is the code for getting smallest prime divisor
        for(int i = 2 ; i< spf.length ; i++)
            spf[i] = i;
        for(int i = 2 ; i*i< spf.length ; i++)
        {
            if(spf[i] == i)
            {
                for(int j = i*i ; j<spf.length ; j+=i)
                {
                    if(spf[j] == j)
                        spf[j] = i;
                }
            }
        }
    }
}
