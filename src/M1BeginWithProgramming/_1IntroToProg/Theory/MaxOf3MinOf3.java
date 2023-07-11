package M1BeginWithProgramming._1IntroToProg.Theory;

import java.util.Scanner;

public class MaxOf3MinOf3 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        y = scn.nextInt();
        z = scn.nextInt();
        int max = maxOf3(x, y, z);
        System.out.println("Max of 3 is: " + max);

        // I wanna know what is the count of max elements
        int countMax = 0;
        if(x == max) countMax++;
        if(y == max) countMax++;
        if(z == max) countMax++;
        System.out.println("Count of max elements are: "+ countMax);
        int min = minOf3(x, y, z);
        System.out.println("Min of 3 is: " + min);

        // I wanna know what is the count of min elements
        int countMin = 0;
        if(x == min) countMin++;
        if(y == min) countMin++;
        if(z == min) countMin++;
        System.out.println("Count of min elements are: "+ countMin);
    }

    private static int minOf3(int x, int y, int z) {
        if(x<=y && x<=z){
            return x;
        }else if(y<=x && y<=z){
            return y;
        }else{
            return z;
        }
    }

    private static int maxOf3(int x, int y, int z) {
        if(x>=y && x>=z){
            return x;
        }else if(y>=x && y>=z){
            return y;
        }else{
            return z;
        }
    }
}
