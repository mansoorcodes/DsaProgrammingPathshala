package M1BeginWithProgramming._1IntroToProg.Problems._2DecissionMaking;

import java.util.Scanner;

public class _1CompareTriplets {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        // want to use arrays to reduce redundancy
        betterCode();
        redundantCode();
    }
    public static void betterCode(){
        Scanner scn = new Scanner(System.in);
        int alice = 0, bob = 0;
        int [] a = new int [3];
        int [] b = new int [3];
        for(int i = 0; i<3; i++){
            a[i] = scn.nextInt();
        }
        for(int i = 0; i<3; i++){
            b[i] = scn.nextInt();
        }
        for(int i = 0; i<3; i++){
            if(a[i] > b[i]) alice ++;
            else if (a[i] < b[i]) bob++;
        }
        System.out.println(alice+" "+bob);
    }
    public static void redundantCode(){
        int a = 0, b= 0;
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt(), a2 = scn.nextInt(), a3 = scn.nextInt();
        int b1 = scn.nextInt(), b2 = scn.nextInt(), b3 = scn.nextInt();
        if(a1>b1){
            a++;
        }else if (b1 >a1) {
            b++;
        }
        if(a2>b2){
            a++;
        }else if (b2 >a2){
            b++;
        }
        if(a3>b3){
            a++;
        }else if (b3 >a3){
            b++;
        }
        System.out.println(a+" "+b);
    }
}
