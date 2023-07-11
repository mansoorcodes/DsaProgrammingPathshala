package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // System.out.println(cnt(n));


        int low = scn.nextInt();
        int high = scn.nextInt();
        int ld = Integer.toString(low).length();
        int hd = Integer.toString(high).length();
        System.out.println("ld: "+ld+" hd: "+hd);

        StringBuilder number = new StringBuilder();
        for (int i = 1; i <= ld; i++) {
            number.append(i);
        }
        System.out.println(number);



    }
    private static long cnt(long temp) //returns the length of final list
    {
        long x=1;
        while(temp>1)
        {
            temp/=2;
            x*=2;
        }
        return 2*x -1;
    }
}
