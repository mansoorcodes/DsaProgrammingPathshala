package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class CodeFor1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long temp = n;
        long l = scn.nextLong();
        long r = scn.nextLong();
        // this is the way to find Log N base 2.............
        int logN = (int)(Math.log(n) / Math.log(2));
//        System.out.println(logN);
        long [] totalOnes = new long[logN +1];
        for (int i = totalOnes.length-1; i >= 0; i--) {
            totalOnes[i] = temp;
            temp /= 2;
        }
        long [] lengthOfStates = new long[logN +1];
        for (int i = 0; i < lengthOfStates.length; i++) {
            long p = (long)Math.pow(2, i+1) -1;
            lengthOfStates[i] = p;
        }

//        System.out.println(Arrays.toString(totalOnes));
//        System.out.println(Arrays.toString(lengthOfStates));

        // don't pss l, r
        // pass their distance from mid
        long mid = (lengthOfStates[logN] /2) +1;
        System.out.println("Total answer is: "+  findAns(totalOnes, lengthOfStates, l, r, r-l, mid, n));

    }

    private static long findAns(long[] totalOnes, long[] lengthOfStates, long l, long r, long dis, long mid, long N) {
        if(dis <= 0) return 0;
        for (int i = 0; i < lengthOfStates.length; i++) {
            if(dis == lengthOfStates[i]) return totalOnes[i];
        }
        // base case over
        // now recursion logic

        long leftDis = mid -l;

        System.out.println("l: "+l+" r: "+r+"\nLeftDis: "+leftDis+"\n"+"Mid: "+mid+"\n");

        if(leftDis == 0) return 0;


        int logVal = (int)(Math.log(leftDis) / Math.log(2));

        // this is in some site
        // https://www.techiedelight.com/calculate-log-base-2-in-java/
        // int logVal = (int)(Math.log(leftDis) / Math.log(2) + 1e-10);

        System.out.println(logVal);

        long newMid = (lengthOfStates[logVal] /2) +1;
        newMid = mid - newMid;
        long LeftAns = findAns(totalOnes, lengthOfStates, l, mid, leftDis, newMid, totalOnes[logVal]);

        long rightDis = r - mid;
        logVal = (int)(Math.log(rightDis) / Math.log(2));

        // logVal = (int)(Math.log(rightDis) / Math.log(2) + 1e-10);

        if(rightDis == 0) return 0;


        newMid = (lengthOfStates[logVal] /2) +1;
        newMid = mid + newMid; // 32 + 16 = 48
        long rightAns = findAns(totalOnes, lengthOfStates, mid, r, rightDis, newMid, totalOnes[logVal]);

        return LeftAns + rightAns + N%2;
    }
}
