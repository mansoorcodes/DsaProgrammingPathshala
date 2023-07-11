package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class SpeacialSeries {
    public static void main(String[] args) {
        long a = 1, sum = 0; // use long here bc for small n also int overflows here...
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<= n ; i++){
            sum += a;
            System.out.print(a+" ");
            a = a*10 +1;
        }
        System.out.println("\nSum of series is: "+sum);
    }
}
