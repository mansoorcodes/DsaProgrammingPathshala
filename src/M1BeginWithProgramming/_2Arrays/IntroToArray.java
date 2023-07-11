package M1BeginWithProgramming._2Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntroToArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int marks [] = new int[3];
//        float sum = 0;
//        for(int i = 0; i< 3; i++){
//            marks[i] = scn.nextInt();
//            sum += marks[i];
//        }
//        for(int i = 0; i< 3; i++){
//            System.out.print(marks[i] +" ");
//        }
//        float avg = sum / 3;
//        System.out.printf("\nAverage of marks is: %.2f",avg);

        int a [] = {1,3,3,2,8,5,0,3,6};
        int b [];
        b = a;
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("b: "+Arrays.toString(b));
        //make changes in b Changes also done in a.
        // b/c "b" arr is pointing to Same "a" arr.
        b[3] = 99;
        b[0] = -23;
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("b: "+Arrays.toString(b));

    }
}
