package M2GearingUp.Recursion.DivideAndConquer;

import java.util.Scanner;

public class ModValueOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        System.out.println(k % 3);
        /**
         * k == -46 ---> k % 2 =  0
         * k == -47 ---> k % 2 = -1
         *
         * FOR calculating mod value of negatives, the answer we get is also from
         * ans ---> range --> [-(mod -1) , 0]
         */
    }
}
