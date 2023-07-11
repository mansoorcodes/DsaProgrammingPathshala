package M2GearingUp.Math.RoughWork;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int len = (int)Math.pow(2, n-1);
        System.out.println(len);
    }
}
