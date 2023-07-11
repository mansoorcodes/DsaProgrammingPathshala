package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class ReverseANumberMostEfficient {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev = 0;
        while(n > 0){ // Not even integer overloading.
            rev *= 10;
            int dig = n% 10;
            n /= 10;
            rev += dig;
        }
        System.out.println(rev);
    }
}
