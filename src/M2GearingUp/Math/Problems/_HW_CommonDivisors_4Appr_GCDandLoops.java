package M2GearingUp.Math.Problems;

// all common factors will also be a factor of the gcd of A and B.

//    check my approach
//        suggest me  if it could be optimzed!

        /* package codechef; // don't place package name! */
        import java.util.*;
        import java.lang.*;
        import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
public class _HW_CommonDivisors_4Appr_GCDandLoops
{
    public static int findGCD(int a,int b)
    {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while(max % min!=0)
        {
            int temp = max;
            max = min;
            min = temp%min;
        }
        return min;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j =0;j<t;j++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = findGCD(a,b);
            int gcdRoot =(int)Math.sqrt(gcd);
            int count =0;
            for(int i=2;i<= gcdRoot;i++)
            {
                if(gcd%i==0)
                    count++;
            }
            if(gcdRoot* gcdRoot==gcd)
                count = count+(count-1)+2;
            else
                count = count*2+2;
            System.out.println(count);
        }
    }
}
