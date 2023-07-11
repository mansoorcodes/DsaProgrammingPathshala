package M2GearingUp.Math.Theory;

import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();
        // System.out.println(gcdRecursion(a,b));
        System.out.println("GCD of "+a+" and "+b+" is: "+gcdLoops(a,b));
        System.out.println("LCM of "+a+" and "+b+" is: "+ lcm(a, b));
    }

    private static int gcdLoops(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int divisor = min;
        int dividend = max;
        if(min == 0) return max;
        while (true){
            int rem = dividend % divisor;
            if(rem == 0) return divisor;
            dividend = divisor;
            divisor = rem;
        }
    }
    private static int lcm(int a, int b){
        int gcd = gcdLoops(a, b);
        return a* b / gcd;
    }

    public static int gcdRecursion(int a, int b)
    {
        if (a == 0)
            return b;
        return gcdRecursion(b % a, a);
    }
}
