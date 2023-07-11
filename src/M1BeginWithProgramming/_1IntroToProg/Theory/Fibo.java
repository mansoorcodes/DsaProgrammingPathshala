package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
/*
This is not a corret method bc its starting frm f(2), if we want to print f(0) it prints wrong
I have to change it explicitly by adding if if if.
        int fnm2 = 0, fnm1 = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(0 + " " + 1 +" ");

        for(int i = 2; i<= n; i++){
            int fibo = fnm2 + fnm1;
            System.out.print(fibo+" ");
            fnm2 = fnm1;
            fnm1 = fibo;
        }
*/
        // first Approach looping from [0 to n]
        int fn = 0, fnp1 = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fiboOfN = 0;
        System.out.print("Fibonacci series are: ");

        for(int i = 0; i<= n; i++){
            int fnp2 = fn+fnp1;
            fiboOfN = fn;
            System.out.print(fn+" ");
            fn = fnp1;
            fnp1 = fnp2;
        }
        System.out.println("\nNth Fibonacci number is: "+fiboOfN);

        // Second approach looping from [1 to n]
        fn = 0; fnp1 = 1;
        for(int i = 1; i<= n; i++){
            int fnp2 = fn+fnp1;
            //fiboOfN = fn;
            //System.out.print(fn+" ");
            fn = fnp1;
            fnp1 = fnp2;
        }
        System.out.println("Second approach: Nth fib is: "+fn);

    }
}
