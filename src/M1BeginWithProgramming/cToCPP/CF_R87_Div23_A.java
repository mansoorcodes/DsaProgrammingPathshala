package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

// this works but there is another approach which is bugging me I can't understand


public class CF_R87_Div23_A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- >0){
            int n = scn.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i*2 +" ");
            }
            System.out.println();
        }
    }
}
