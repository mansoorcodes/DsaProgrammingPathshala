package M1BeginWithProgramming.cToCPP;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        while(k-- >0){
            int lastDig = num % 10;
            if(lastDig == 0) num /= 10;
            else num--;
        }
        System.out.println(num);
    }
}
