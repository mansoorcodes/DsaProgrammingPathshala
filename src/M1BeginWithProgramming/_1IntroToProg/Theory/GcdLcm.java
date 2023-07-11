package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int max , min = 0;
        if (x>= y) {
            max = x;
            min = y;
        }
        else {
            max = y;
            min = x;
        }
        int i = 1, lcm = 0;
        while(true){
            if(max * i % min == 0){
                lcm = max *i;
                break;
            }
            i++;
        }
        System.out.println("lcm is: " +lcm);
    }
}
