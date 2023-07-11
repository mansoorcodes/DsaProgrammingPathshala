package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class FloorAndCeilDivision {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("floorDivision of "+ a +" "+ b + " is: "+floorDivision(a, b));
        System.out.println("ceilDivision of "+ a +" "+ b + " is: "+ceilDivision(a, b));

        System.out.println("using Methods");
        System.out.println("floorDivision of "+ a +" "+ b + " is: "+floorDivisionWithMethod(a, b));
        System.out.println("ceilDivision of "+ a +" "+ b + " is: "+ceilDivisionWithMethod(a, b));
    }

    private static int ceilDivisionWithMethod(int a, int b) {
        return (int)Math.ceil((double)a/b);
    }

    private static int floorDivisionWithMethod(int a, int b) {
        return (int)Math.floor((double)a/b);
    }

    private static int ceilDivision(int a, int b) {
        return  (a+b-1)/b;
    }

    private static int floorDivision(int a, int b) {
        return a/b;
    }
}
